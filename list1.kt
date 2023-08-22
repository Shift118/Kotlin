fun main() {
    var str = "AB"  // If change to var you can modify it directly
    str = str + "D"
//    val newStr = str + "C"
//    println(newStr)  // ABC
    println(str)     // ABD
/////////////////////////////////////////////////////
    var list = listOf("A","B") // If change to var you can modify it directly
    list = list + "D"
//    val newlist = list + "C"
//    println(newlist) // [A, B, C]
    println(list)    // [A, B, D]
    println(list.size)
    println(list.isEmpty()) // SameAS // list.size == 0
    println(list[0])  //A
    println(list[1])  //B
    println(list[2])  //D

    // Checking If the List Contains an Element
    print(list.contains("B")) // True
    print(list.contains("F")) // False
    // Or Using !in
    println("A" !in list) // false
    println("F" !in list) // true

    // Iterating over Lists
    for (letters in list){
        println(letters)
    }



}