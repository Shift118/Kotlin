import java.lang.NumberFormatException
fun main() {
    try {  // Monitor this code for an expected Error
        val stringtoint: Int = "ABCX".toInt()  // String to Int
        println(stringtoint)
    }catch (e: Throwable){
        // You can use anything rather than e
        // To catch any Throwable
        // Throwable is type of error expected
        // If you type another type of error that isn't related
        // The error won't be caught and an error will appear.
        // Also you can write multipe Catch
        // Throwable is a super type for all the exceptions
        println(e.message)
    }catch (t: ArithmeticException){
        println("ArithmeticException")
    }catch (t: NumberFormatException){
        println("NumberFormatException")
    }finally {
        println("This is Final.")
    }
    println("Done")
}
