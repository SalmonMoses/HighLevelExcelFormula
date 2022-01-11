package exceptions

class UndefinedMacroArgException(private val name: String): Throwable() {
    override val message: String
        get() = "undefined macro arg: $name"
}