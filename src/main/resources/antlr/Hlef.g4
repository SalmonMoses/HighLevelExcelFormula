grammar Hlef;

IF: 'if';
THEN: 'then';
END: 'end';
ELSE: 'else';
ELIF: 'elif';
TRUE: 'true';
FALSE: 'false';
EMPTY: 'empty';
AND: 'and';
OR: 'or';
NOT: 'not';
ERROR: 'error';

CELL_ID: '$'? [a-zA-Z]+ '$'? [0-9]+;
ID: [a-zA-Z_] [a-zA-Z_0-9+]*;
NUMBER: [0-9]+ ('.'[0-9]+)? ([eE][0-9]+)?;
STRING: '"' ~["\n]* '"';
SHEET_ID: '\'' ~["\n]* '\'';
WS: [\t\r\n ]+ -> skip;
COMMENT: '//' ~[\r\n]* '\r'? '\n' -> skip;

DOLLAR: '$';
AT: '@';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
ASSIGN: ':=';
EQUAL: '=';
NOT_EQUAL: '<>';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';
GREATER: '>';
LESS: '<';
COMMA: ',';
EXCLAMATION_POINT: '!';

argName: DOLLAR ID;
macroUseName: AT ID;
argUse: argName;
rangeLiteral: (SHEET_ID EXCLAMATION_POINT)? CELL_ID (COLON CELL_ID)?;
grouping: (LPAREN expr RPAREN) ;
primary: TRUE | FALSE | NUMBER | STRING | rangeLiteral | grouping | argUse | EMPTY;

macroUse: macroUseName (LPAREN args=functionArguments RPAREN)?;

call: ID LPAREN args=functionArguments RPAREN;
functionArguments: (args+=expr (COMMA args+=expr)*)?;

unary: ((MINUS | NOT) unary) | call | primary | macroUse;
factor: left=unary (op+=(SLASH | STAR) right+=unary)*;
term: left=factor (op+=(PLUS | MINUS) right+=factor)*;
comparison: left=term (op+=(GREATER | GREATER_EQUAL | LESS | LESS_EQUAL) right+=term)*;
equality: left=comparison (op+=(EQUAL | NOT_EQUAL) right+=comparison)*;
logicAnd: left=equality (AND right+=equality)*;
logicOr: left=logicAnd (OR right+=logicAnd)*;
errorHandler: expression=logicOr (IF ERROR handler=expr)?;

argumentsDecl: argName (COMMA argName)*;
decl: name=macroUseName (LPAREN argumentsDecl RPAREN)? ASSIGN body=expr;

block: decls+=decl* expr;

ifExpr
    : IF LPAREN cond=expr RPAREN thenBlock=block
      (ELIF LPAREN elifCond+=expr RPAREN elifExpr+=block)*
      (ELSE elseBlock=block)?
      END
    ;

expr: errorHandler | ifExpr;

formula: decl* expr EOF;