// Using Elvis Operator
class UserName(val name: String?)
fun namePrint(userData: UserName?){
    // Using Elvis you can set a Default value for instance with null Value
    // Thus solving the problem rather that getting an Error
    val userDefault = userData ?: UserName("Undefined Identity")
    println(userDefault.name)
}
fun main() {
    val identity1 = UserName("Ahmed")
    val identity2 = UserName(null)

    namePrint(identity1)
    // This will work because i used name variable as a string
    // meaning that it isn't a true null like the last line.
    namePrint(identity2)
    namePrint(null)
}