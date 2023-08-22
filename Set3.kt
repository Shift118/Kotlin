fun main() {
    val letter = setOf('A','B','C')
    println(letter.contains('A')) //True
    println(letter.contains('F')) //False
    println('A' in letter) //True
    println('D' in letter) //False

    //// Iterating Over
    for (char in letter){
        println(char)
    }
}