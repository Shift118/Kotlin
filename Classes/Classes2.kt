class Student(
    val id: Int,
    val name: String,
    val surname: String,
    val organic: Subject,
    val grade: Float,
)
class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
){val fullName: String = "$name $surname"}
class  Subject (
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
)
fun main() {
    var teacher1 = Teacher("Mostafa","Alerian","22.10.2003","Active")
    var subject1 = Subject("Organic",teacher1,true)
    var student1 = Student(120200302,"Malek","Ahmed",subject1,2.3F)

    println(student1.id)
    println(student1.organic.teacher.fullName)
    println(student1.grade)
}