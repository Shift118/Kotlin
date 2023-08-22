class Users(
    val userId: Int,
    val message: String
)

fun main() {
    val comments: List<Users> = listOf(
        Users(5241,"Nice Code!"),
        Users(6624,"Like it"),
        Users(5224,"What's going on?"),
        Users(9001,"Check out my Website"),
        Users(8828,"Hello Everyone 3>"),
    )
    val blockedUsersIds = setOf(5224,9001)
    val userIdToRelation = mapOf(5241 to "Friend", 6624 to "Work College")
    for (comment in comments){
        if (comment.userId !in blockedUsersIds){
            if (comment.userId in userIdToRelation){
                println(comment.message +" from "+ userIdToRelation[comment.userId])
            }else {
                println(comment.message+" from Unkown")
            }
        }
    }
}