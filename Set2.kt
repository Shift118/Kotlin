class User(val name:String)


fun main() {
    ///// Using Class
    val set2 = setOf(User("Sara"),User("Sara"))
    println(set2 + User("Sara")) // [User@2dda6444, User@5e9f23b4, User@6e2c634b]
    // Using Abstract Class The classes would be considered as duplicate
    // Thus printing => [User(name=Sara)]
    ////////////////////////////////////////////////////
    val set = setOf('A','B','A','B')
    println(set) //[A, B] #No_Repeat
}