//////THis File is commented because of File Classes7 have the same Classes.

//class Player(
//    var name: String,
//    var surname: String,
//    var totalScore: Double,
//    var personalBestScore: Double
//) {
//    fun fullName() : String{
//        return "$name $surname"
//    }
//}
//class Scores(
//    var current: Double,
//    var best: Double
//){
//    fun bestScore(): Double{
//        if (current > best) {
//            return current
//        }
//        return best
//    }
//}
//
//fun main(){
//    var v1score = 0.0
//    var v2score = 0.0
//    var p1 = Player("Hazem","Younes",80.0, 30.0)
//    var p2 = Player("Boda","Nasr",90.0,35.0)
//    fun printing(v1score : Double,v2score : Double) {
//        var score1= Scores(v1score,p1.personalBestScore)
//        var score2= Scores(v2score,p2.personalBestScore)
//        println(p1.fullName() +" Score is "+ score1.bestScore())
//        println(p2.fullName() +" Score is "+ score2.bestScore())
//        println()
//    }
//    //    Exam 1
//    v1score = 10.0
//    v2score = 36.5
//    printing(v1score,v2score)
//    //    Exam 2
//    v1score = 43.0
//    v2score = 46.5
//    printing(v1score,v2score)
//    //    Exam 3
//    v1score = 32.3
//    v2score = 31.4
//    printing(v1score,v2score)
//}