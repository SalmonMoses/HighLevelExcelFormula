package exceptions

class TooManyArgumentsException(private val name: String, private val expected: Int, private val found: Int) : Throwable() {
    override val message: String
        get() = "too many arguments for $name invocation: expected $expected, found $found"
}