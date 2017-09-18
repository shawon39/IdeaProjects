

fun main(args: Array<String>) {

    print("Enter A Number: ")
    var number = readLine()!!.toInt()

    if(number > 50) {

        if (number >= 80) {
            println("You Got A+ !")
        }
        else{
            println("You didn't get A+ !")

        }
    }

}