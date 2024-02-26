fun freeRoomsPrint(numberOFrooms: Int,busyRoomsList: MutableList<BusyRooms>){
    var busyRooms = mutableSetOf<Int>()
    var freeRooms = (1..numberOFrooms).toMutableSet()
    for (room in busyRoomsList){
        busyRooms.add(room.roomNumber)
    }
    for (busyRoomID in busyRooms){
        if (freeRooms.contains(busyRoomID)){
            freeRooms.remove(busyRoomID)
        }
    }
    println(busyRooms)
    println(freeRooms)
}