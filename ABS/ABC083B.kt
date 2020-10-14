private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    val (n, a, b) = readInts()
    val ans = (1..n).filter {
        val x = it.toString().toCharArray().map { it.toString().toInt() }.sum()
        a <= x && x <= b
    }.sum()
    println(ans)
}
