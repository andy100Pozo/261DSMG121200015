package codelab4


fun main() {
    println(comparePhoneUsage(timeSpentToday = 300, timeSpentYesterday = 250))
    println(comparePhoneUsage(timeSpentToday = 300, timeSpentYesterday = 300))
    println(comparePhoneUsage(timeSpentToday = 200, timeSpentYesterday = 220))
}

fun comparePhoneUsage(
    timeSpentToday: Int,
    timeSpentYesterday: Int
): Boolean {
    return timeSpentToday > timeSpentYesterday
}