package exceptions

class UndefinedMacroException(private val name: String) : Throwable() {
    override val message: String
        get() = "undefined macro: $name"
}