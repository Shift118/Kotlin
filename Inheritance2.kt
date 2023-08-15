open class Family{
    fun feedChildren(){}
}

class YoungBoy: Family(){
    fun payMoney(){}
}

fun feed(family: Family){
    family.feedChildren()
}

fun main() {
    val bigOne = YoungBoy()
    feed(bigOne)
    bigOne.payMoney()
}