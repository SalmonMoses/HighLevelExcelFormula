package exceptions

import org.antlr.v4.runtime.ParserRuleContext

class NullExpressionException(private val ctx: ParserRuleContext?): Throwable() {
    override val message: String
        get() = "null expression exception: ${ctx?.text}"
}