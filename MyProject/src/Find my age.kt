import java.util.*

/**
 * Created by shsha on 26/05/2017.
 */

fun main(args: Array<String>) {

    print("Enter Your DOB: ")
    var DOB: Int = readLine()!!.toInt()
    var lol: Int?

    val year = Calendar.getInstance().get(Calendar.YEAR)
    println(year)

    lol = year - DOB

    println("Your Age: "+lol+" years")

}