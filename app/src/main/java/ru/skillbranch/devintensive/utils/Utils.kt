package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?) : Pair<String?, String?> {
        val parts : List<String>? = fullName?.split(" ")
        val firstName = if (fullName.isNullOrBlank()) null else parts?.getOrNull(0)
        val lastName = if (fullName.isNullOrBlank()) null else parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " ") : String {
        TODO()
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO()
    }
}