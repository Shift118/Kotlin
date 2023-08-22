fun main() {
    // You could Add, Remove, Modify From Mutable List
    val mutableList = mutableListOf("A","B")
    mutableList.add("C")
    mutableList.remove("A")
    mutableList[0] = "X"
    println(mutableList)
}