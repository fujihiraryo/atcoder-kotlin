private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    val n = readInt()
    var d = mutableListOf<Int>()
    (1..n).forEach{
        d.add(readInt())
    }
    d.sort()
    var tmp = 0
    var cnt = 0
    d.forEach {
        if (tmp < it) {
            cnt += 1
            tmp = it
        }
    }
    println(cnt)
}
