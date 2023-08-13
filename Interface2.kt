interface Animal {
    val breed: String
    fun pet()
}

class Cat(
    val name: String,
    override val breed: String
):Animal{
    override fun pet() {
        println("CAT MEOW!")
    }
}
class Dog(
    val name: String,
    override val breed: String
):Animal{
    override fun pet() {
        println("Dog Woff!")
    }
}

fun pet(animal: Animal){
    animal.pet()
}
fun main() {
    pet(Cat("Kitty","North Blue"))
    pet(Dog("Tusk","Husky"))
}