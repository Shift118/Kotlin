//There are 2 ways to make a pair

//1st
//fun main() {
//    val pair = Pair(1.0, 'A')
//    println(pair.first) // 1.0
//    println(pair.second) // A
//    val (number, letter) = pair
//     // the type of number is Double
//     // the type of letter is Char
//    println(number) // 1.0
//    println(letter) // A
//}

//2nd
//fun main() {
//    val pair = 1.0 to 'A'
//    println(pair.first) // 1.0
//    println(pair.second) // A
//    val (number, letter) = pair
//    // the type of number is Double
//     // the type of letter is Char
//    println(number) // 1.0
//    println(letter) // A
//}

//Also there is a way to set 3 values to variable
//fun main() {
//    val threeValues = Triple(1F, "ABC", true)
//    println(threeValues.first) // 1.0
//    println(threeValues.second) // ABC
//    println(threeValues.third) // true
//    val (number, letters, boolean) = threeValues
//     // the type of number is Double
//     // the type of letters is Char
//     // the type of boolean is Boolean
//    println(number) // 1.0
//    println(letters) // ABC
//    println(boolean) // true
//}