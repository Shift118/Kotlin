class Employee(  // This is a property // Objects that are stored and can be called.
    val name: String,
    var position: String
) {
//    var label : String = "Lable" // This is a property // Must say its type !! // can also be called
    var label : String = "$name ($position)"
}


fun main() {
    val employee1 = Employee("Mostafa","Programmer")
    var employee2 = Employee("Boda","copycat")

    println(employee1.name)
    println(employee1.position)
    println(employee2.name)
    println(employee2.position)

    employee2.position = "Nigga"  // Can't change empoyee1 because it is val not var
    println(employee2.position)
//    employee2.label = "The Nigga"
    println(employee2.label)
}

