class Employee(
    val name: String,
    var position: String
)

fun main() {
    val employee1 = Employee("Mostafa","Programmer")
    val employee2 = Employee("Boda","CopyCat")

    println(employee1.name)
    println(employee1.position)
    println(employee2.name)
    println(employee2.position)

}

