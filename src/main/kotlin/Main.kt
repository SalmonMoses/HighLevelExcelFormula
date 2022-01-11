import compiler.CompilingVisitor
import me.salmonmoses.hlef.HlefBaseVisitor
import me.salmonmoses.hlef.HlefLexer
import me.salmonmoses.hlef.HlefParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import kotlin.system.exitProcess
import java.io.File

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: hlef [file]")
        exitProcess(1)
    }

    val source = File(args[0]).readLines().joinToString("\n")
    val compiled = compile(source)
    println(compiled)
}

fun compile(src: String): String {
    val lexer = HlefLexer(CharStreams.fromString(src))
    val tokenStream = CommonTokenStream(lexer)
    val parser = HlefParser(tokenStream)
    val tree = parser.formula()
    val visitor = HlefVisitor()
    val ast = visitor.visit(tree)
    val compiler = CompilingVisitor()
    return compiler.compile(ast!!)
}