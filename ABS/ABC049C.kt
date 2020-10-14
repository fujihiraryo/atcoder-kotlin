private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    val ans = if (
        readLn().replace("eraser", "").replace("erase", "").replace("dreamer", "").replace("dream", "").isEmpty()
    ) "YES" else "NO"
    println(ans)
}
