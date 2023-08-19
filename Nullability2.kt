//Ex1
//To avoid these errors, you will need to check for a null value before accessing the property.

//fun main() {
//    var message: String? = "Hello World"
//    message = "null" //Assign null to the variable
//    val length = if(message != null){
//        message.length
//    }else{10} // Will cause a Null Pointer Exception
//    println("length: $length")
//}

//Ex2
//The safe call is when ?. is used instead of .
// A safe call calls the right side if the left side is not null. Otherwise, it does nothing and returns null.

//fun main() {
//    var message: String? = "Hello World"
//    println(message?.length) //Will print 11
//    message = null //Assign null to the variable
//    println(message?.length) //Will print null
//}

//Ex3
//=> Look at the page 3 for the Not Null Example.
//class UserN(val name: String?)
//fun names(userData: UserN?){
//    println(userData?.name)
//}
//fun main() {
//    val name1 = UserN("Ahmed")
//    val name2 = UserN(null)
//
//    names(name1)
//    names(name2)
//}