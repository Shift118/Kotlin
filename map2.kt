fun main() {
    // Map is Immutable so we just clone it
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    // can be cloned and there is add and minus.
    val map2 = map1 + mapOf('B' to "Barry",'C' to "Clair") - 'A'
    println(map1)
    println(map2) //Won't Add another key it will modify existing one.
    println('A' in map1) // True
    println(map1.size) //2

    //Iterate there is 2 ways
    for (entry in map1){
        println("${entry.key} is for ${entry.value}.")
    }
    // OR
    for ((id,name) in map2) {
        println("$id is for $name.")
    }
}