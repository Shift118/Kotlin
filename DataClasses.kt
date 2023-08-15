data class Dog(
    val name: String,
    val age : Int
) // by changing to data class the data print is different
  // more like data printing

fun main() {
    val pluto1 = Dog("Pluto",1)
    val pluto2 = Dog("Pluto",1)

    // By changing the class to a Data Class the identical dog name is equal
    //so it printed True

    println(pluto1 == pluto2) // false
    println(pluto1 == pluto1) // true

    // By changing the class to a Data Class
    //It printed the Instances differently

//    Dog1: Dog(name=Pluto)
    println("Dog1: $pluto1") // Dog: Dog@b4c966a
//    Dog2: Dog(name=Pluto)
    println("Dog2: $pluto2") // Dog: Dog@2f4d3709

    /////////////////////////////////////////////

    // You could Also assign class properties to variables
    val(name,age) = pluto1
    println(name)
    println(age)

    // You could also change the value of properties in class even if they were val
    // By making a copy

    val pluto3 = pluto1.copy(age = 97)
    println(pluto3)
    println(pluto3.copy(name = "ChiChi"))
}