import kotlin.math.abs

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    val n = readInt()
    var t0 = 0
    var x0 = 0
    var y0 = 0
    (1..n).forEach {
        var (t1, x1, y1) = readInts()
        val t = t1 - t0
        val d = abs(x1 - x0) + abs(y1 - y0)
        if (t >= d && (t - d) % 2 == 0) {
            t0 = t1
            x0 = x1
            y0 = y1
        } else {
            println("No")
            return
        }
    }
    println("Yes")
}
