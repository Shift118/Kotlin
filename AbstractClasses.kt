//Interface                                      |    Abstract class
//All methods are open                           |    -Methods can be open or non open
//Methods and members are abstracted by default  |    -Methods and members can be abstract or non abstract
//A class can implement one or more interface    |    -A class can only be inherited  from one class

abstract class ShapeDrawer {
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    abstract fun drawLine() //  You Override what you call Abstract Because You are in an abstract Class
}
class AndroidShapeDrawer():ShapeDrawer(){

    override fun drawLine() {
        //code that draw lines for android platform 
        println("Test code -Draw line for  android platform")
    }
}
class DesktopShapeDrawer():ShapeDrawer(){
    override fun drawLine() {
        //code that draw lines for android platform 
        println("Test code -Draw line for  desktop platform")
    }
}
fun main(){
    val androidDrawer:ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawRectangle()
} 