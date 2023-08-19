var name: String? = null // Can Accept Null Value
var i: Int? = null // Can Accept Null Value
var c: Char? = null // Can Accept Null Value

class User(val name: String?) // Name accepts Null Value

var user: User? = null //variable accepts Null Value

fun processUser(user: User?):User?{ //argument accepts Null Value
    // And can return Null
    return null
}

fun main() {
    val result: User? = processUser(null) // Can Accept Null Value
    val user = User(null) // Class Property can accept null value

}