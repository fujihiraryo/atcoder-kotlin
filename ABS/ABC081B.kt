private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    readInt()
    val ans = readInts().map {
        var cnt = 0
        var tmp = it
        while (tmp % 2 == 0) {
            tmp /= 2
            cnt += 1
        }
        cnt
    }.min()
    println(ans)
}
