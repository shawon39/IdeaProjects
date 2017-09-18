

fun main(args: Array<String>) {

    print("Enter A Number: ")
    var number = readLine()!!.toInt()

    if( number > 10){

        number = number + 10
    }

    println(number)

}