private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    readLn()
    val a = readInts().toMutableList()
    a.sortDescending()
    var x =0
    var y=0
    var t=0
    a.forEach{
        if (t==0) {
            x+=it
            t=1
        } else {
            y+=it
            t=0
        }
    }
    println(x-y)
}
