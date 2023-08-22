fun main() {
    // Unordered Collection of key-value pairs. Can Have duplicates.
    // More useful for logical connections like Employee's ID & Position.
    val capitals: Map<String,String> = mapOf("USA" to "Washington", "Egypt" to "Cairo" , "France" to "Paris")
    /////OR//////
//    val capitalss = mapOf(
//        Pair("USA" , "Washington"),
//        Pair("Egypt" , "Cairo" ),
//        Pair("France" , "Paris")
//    )
    println(capitals)
    ////////////////////////////////////////
    val alphabet: Map<Char,Int> = mapOf('A' to 1,'B' to 2,'C' to 3)
    val number: Int? = alphabet['A']
    println(number)  // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
}