private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
fun main() {
    val (a,b) = readInts()
    if (a%2==0 || b%2==0) {
        println("Even")
    } else {
        println("Odd")
    }
}
