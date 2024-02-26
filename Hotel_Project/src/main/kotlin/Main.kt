import kotlin.random.Random

fun main() {
    val numberOFrooms = 150 // Number of Rooms
    val numberOFBusyRooms = Random.nextInt(20,numberOFrooms)
    val maxGuests = 3 // Max Guests Number In A Room

    val busyRoomsList = busyRoomsFunciton(numberOFBusyRooms,maxGuests,numberOFrooms)


    println("Rooms = $numberOFrooms")
    println("Busy Rooms = $numberOFBusyRooms")
    println("Free Rooms = ${numberOFrooms - numberOFBusyRooms}")
//    var order = 0
//
//    for (i in busyRoomsList){
//        println("Room(${++order}) = $i")
//    }
    freeRoomsPrint(numberOFrooms,busyRoomsList)
    var available = 1
    while (available == 1){
        println("Rooms = $numberOFrooms")
        println("Busy Rooms = $numberOFBusyRooms")
        println("Free Rooms = ${numberOFrooms - numberOFBusyRooms}")
        println("1. Rent a Room")
        println("2. Check Busy Rooms")
        println("3. Search by Id")
        println("4. Search by room")
        println("5. Exit")
        var userChoice = readln().toInt()
        when (userChoice){
            1 -> break
            2 -> {
                var order = 0
                for (i in busyRoomsList){
                    println("Room(${++order}) = $i")
                }
            }
            3 ->break
            4 -> break
            5 -> available = 0
            else -> break
        }
    }
}