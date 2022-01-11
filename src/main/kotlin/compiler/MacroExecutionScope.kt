package compiler

import Expression

class MacroScope(private val arguments: Map<String, Expression>) {
    fun resolve(name: String): Expression? = arguments[name]
}