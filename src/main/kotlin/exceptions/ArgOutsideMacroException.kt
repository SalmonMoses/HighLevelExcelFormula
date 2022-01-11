package exceptions

class ArgOutsideMacroException : Throwable() {
    override val message: String
        get() = "impossible to use argument outside of macro body"
}