fun main(args: Array<String>) {

    print("Enter A Number: ")

    var number = readLine()!!.toInt()

    if( number > 80){

        println("You Got A+")
    }
    else if(number >= 70 && number < 80){

        println("You Got A")
    }
    else if(number >= 60 && number < 70){

        println("You Got A-")
    }
    else{
        println("You Fail !!")
    }


}