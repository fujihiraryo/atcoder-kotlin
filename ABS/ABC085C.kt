private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    val (n,y) = readInts()
    for (i in 0..n) {
        for (j in 0..(n-i)) {
            val k = n - (i+j)
            if (10000*i+5000*j+1000*k == y) {
                println("$i $j $k")
                return
            }
        }
    }
    println("-1 -1 -1")
}
