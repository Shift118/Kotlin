fun main() {
    val map: MutableMap<Char,String> = mutableMapOf('A' to "Alex", 'B' to "Bob")

    map.put('J',"Jesse")
    map['D'] = "Dalia" // Preferred for INTELLJ
    map.remove('B')
    println(map)

}