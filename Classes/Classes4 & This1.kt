//class Dog (
//    val name : String
//) {
//    var hunger = 62
//}
//
//fun feed (dog : Dog){
//    println("${dog.name} is Eating.")
//    dog.hunger = 0
//}

class Dog(var name : String){
    var hunger = 90
    fun feed(){
        hunger = 0
        var currentDog = this  // "This" allows the variable to have the object of the class.
                                // That is why you used it to print the name.
        println("${currentDog.name} is Eating.")
    }
}
fun main(){
    var dog1 = Dog("Bond")
//    feed(dog1) or you can make the same function in another way
    dog1.feed() // Same output as before.
}