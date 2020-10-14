private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    val a = readInt()
    val b = readInt()
    val c = readInt()
    val x = readInt()
    var cnt = 0
    for (i in 0..a) {
        for (j in 0..b) {
            for (k in 0..c) {
                if (500 * i + 100 * j + 50 * k == x) {
                    cnt += 1
                }
            }
        }
    }
    println(cnt)
}
