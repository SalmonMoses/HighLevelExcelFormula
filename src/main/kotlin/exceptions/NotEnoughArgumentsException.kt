package exceptions

class NotEnoughArgumentsException(private val name: String, private val expected: Int, private val found: Int) : Throwable() {
    override val message: String
        get() = "not enough arguments for $name invocation: expected $expected, found $found"
}