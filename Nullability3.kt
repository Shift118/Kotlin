// Using Not Null Assertion
class UserNameClass(val name: String?)
fun namePrintFunction(userData: UserNameClass?){
    println(userData!!.name)
}
fun main() {
    val person1 = UserNameClass("Ahmed")
    val person2 = UserNameClass(null)

    namePrintFunction(person1)
    namePrintFunction(person2) // This will work because i used name variable as a string
                               // meaning that it isn't a true null like the last line.
    namePrintFunction(null)
}

///////////Smart casting is when you use if to avoid null errors

// If (userData != null)