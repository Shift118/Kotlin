interface Operations {
    fun sum(n1: Double ,n2: Double)
    fun sub(n1: Double ,n2: Double)
}

class Worker1:Operations{
    override fun sum(n1: Double, n2: Double) {
        println(n1 + n2)
    }
    override fun sub(n1: Double, n2: Double) {
        println(n1-n2)
    }
}

class Worker2:Operations{
    override fun sum(n1: Double, n2: Double) {
        println(n1+n2+100.0)
    }

    override fun sub(n1: Double, n2: Double) {
        println(n1-n2+100.0)
    }
}

fun main(){
    var work1 = Worker1()
    work1.sum(10.0,10.0)
    work1.sub(1.0,10.0)
    var work2 = Worker2()
    work2.sum(10.5,10.5)
    work2.sub(1033.3,100.4)
}
