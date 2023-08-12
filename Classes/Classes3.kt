class Barista (
    val name: String,
){
    fun makeCoffee(type : String , count : Int) : Coffee { // This is a Method that return a call and prints
        println("$name is making $count $type Coffee")
        return Coffee(type,count)
    }
    fun cheerANDmakeCoffee (type : String , count : Int){  // This is a Method that runs another Method and Print
        println("Hello")
        makeCoffee(type,count)
    }
}

class Coffee(
    val type: String,
    val count: Int
)

fun main(){
    var barista1 = Barista("James")
//    var coffee1 = barista1.makeCoffee("Hot",18)
    barista1.cheerANDmakeCoffee("Hot Americano",5)
}