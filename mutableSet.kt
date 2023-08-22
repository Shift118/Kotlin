fun main() {
    val set = mutableSetOf('A','B')
    set.add('C')
    println(set)
    set.remove('B')
    println(set)
}