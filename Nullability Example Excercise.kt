data class Student (
    val id: Int,
    val name: String,
    val grade: Double
)
////////////////////List//////////////////
val students_list = listOf(
    Student(123,"Younes",3.57),
    Student(254,"Karim",3.75),
    Student(796,"Anas",3.14),
    Student(884,"Mariam",3.36),
    Student(369,"Doha",3.80)
)
/////////////////////////////////////////
fun getStudentById(id: Int): Student{
    return students_list.find{it.id == id} !! // !! is the Null Assertion
    // Thus Getting an NPE Null Point Exception
}
fun searchInStudents(name: String): Student? {
    return students_list.find {it.name.lowercase() == name.lowercase()} // Find " it " The child of the list that i want
}
fun main() {
    print("Enter Student Id: ")
    val id: Int = readln().toInt() // Waiting for user input and convert it from string into int
    println(getStudentById(id))
    print("Enter Student Name: ")
    val name: String = readln() // Waiting for an Int
//    if (searchInStudents(name) != null) {
//        println(searchInStudents(name))
//    }else println("Student Not Found")
    // Alternative for the commented code
    println(searchInStudents(name) ?: "Student Not Found")
    // Using Elvis you can set a Default value for instance with null Value
    // Thus solving the problem rather that getting an Error
}

