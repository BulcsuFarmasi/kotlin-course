package s28moreclasses

fun main() {
    val course = KotlinCourse()
    course.getCourseInfo()

    KotlinCourse.getCourseMetaInfo()
}

class KotlinCourse {
    fun getCourseInfo() {
        println("Kotlin is a Java based development language")
    }

    companion object {
        fun getCourseMetaInfo() {
            print("Kotlin is not a difficult language to learn")
        }
    }
}