class Scope(val parent: Scope?) {
    private val macros = mutableMapOf<String, Macro>()

    fun branch() = Scope(this)

    fun resolve(name: String): Macro? = macros[name] ?: parent?.resolve(name)
    fun registerMacro(name: String, macro: Macro) {
        macros[name] = macro
    }
}

class MacroDeclarationScope(val args: List<String>) {
    fun exists(name: String): Boolean = args.find { it == name } != null

    operator fun contains(name: String): Boolean = exists(name)
}

data class Macro(val expr: Expression, val args: List<String>, val scope: Scope) {
    val arity = args.size
}