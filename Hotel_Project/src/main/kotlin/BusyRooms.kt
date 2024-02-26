import kotlin.random.Random
import kotlin.random.nextInt


data class BusyRooms (
    val id: Int,
    val guests: List<String>,
    val daysLeft: Int,
    val roomNumber: Int,
    val location: String
){
    val renter: String = guests[0]
}

fun unqieID(numberOFrooms: Int , userIDs: MutableSet<Int>): Int{
    var newID = Random.nextInt(1,numberOFrooms + 1)
    while (userIDs.contains(newID)){
        newID = Random.nextInt(1,numberOFrooms + 1)
    }
    userIDs.add(newID)
    return newID
}
fun unqieRoomID(numberOFrooms: Int , roomIDs: MutableSet<Int>): Int{
    var newID = Random.nextInt(1,numberOFrooms + 1)
    while (roomIDs.contains(newID)){
        newID = Random.nextInt(1,numberOFrooms + 1)
    }
    roomIDs.add(newID)
    return newID
}



fun busyRoomsFunciton(numberOFBusyRooms : Int, maxGuests: Int, numberOFrooms: Int): MutableList<BusyRooms>{
    val randomNames = listOf("Mariam","Logine","Merihan","Abeer","Malak","Zeina","Ahmed","Mohamad","Mostafa","Younes","Osama","Abdullah","Youssef","Hazem","Amr")
    val randomNames2 = listOf("Ahmed","Mohamad","Mostafa","Younes","Osama","Abdullah","Youssef","Hazem","Amr")
    val building = listOf("B1","B2","B3","B4","B5","B6","B7","B8","B9","B10") // Possible Building
    val floor = listOf("F1","F2","F3","F4","F5","F6","F7","F8","F9","F10") // Possible Floors
    val busyRoomsList = mutableListOf<BusyRooms>()
    val guestIDs = mutableSetOf<Int>()
    val roomsIDs = mutableSetOf<Int>()
    for (i in 1..numberOFBusyRooms){
        val randomGuest = List(Random.nextInt(1,maxGuests+1)){
            "${randomNames.random()} ${randomNames2.random()}"
        }
        var randomId = unqieID(numberOFrooms, guestIDs)
        var randomNumberOFDays = Random.nextInt(1,20)
        var randomRoomsNumber = unqieRoomID(numberOFrooms, roomsIDs)
        var location = " "+building[Random.nextInt(building.size)] + " " +  floor[Random.nextInt(floor.size)]
        var busyRoom = BusyRooms(randomId,randomGuest,randomNumberOFDays,randomRoomsNumber,location)
        busyRoomsList.add(busyRoom)
    }
    return busyRoomsList
}