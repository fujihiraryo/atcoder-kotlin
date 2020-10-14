private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    val a = readInt()
    val (b, c) = readInts()
    val s = readLn()
    println("${a + b + c} $s")
}
