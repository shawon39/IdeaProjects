import java.util.*

fun main(args: Array<String>) {

    print("Enter The Birth Year: ")
    var year:Int = readLine()!!.toInt()

    var CurrentYear = Calendar.getInstance().get(Calendar.YEAR)
    println("Current Year: $CurrentYear")
    var age = CurrentYear - year

    println("Your Age is $age years")

}