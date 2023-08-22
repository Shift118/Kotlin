fun main() {
    val set: Set<Char> = setOf('A','B','C') // You dont have the define the variable
                                            // but only at special situations "Empty"
    println(set) //[A, B, C]
    println(set + 'D') //[A, B, C, D]
    println(set + setOf('D','A','B')) //[A, B, C, D] # Doesn't repeat
    println(setOf('X','A') + set) // [X, A, B, C]   # Doesn't repeat
    println(set.size)  //3
    println(set.size == 0) //false
    println(set.isEmpty()) //false

    val empty: Set<Int> = setOf() // Empty Set
    /////////////////////////////////////////////////////////////////////////////////

    val list = listOf('A','B','C')
    println(list+'B') //[A, B, C, B]
    println(list+ listOf('B','D')) //[A, B, C, B, D]
}