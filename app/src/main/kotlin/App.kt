

fun main(vararg args: String) {

    println(getGreeting("John"))
}

fun getGreeting(name: String): String = "Hello, $name!"

fun sum(a: Int, b: Int): Int = a + b