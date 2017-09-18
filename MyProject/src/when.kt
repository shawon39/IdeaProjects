
fun main(args: Array<String>) {

    var x:Int = readLine()!!.toInt()

    when(x){

        1,466,543-> println("Value Is $x")
        2-> println("Value Is $x")
        3-> println("Value Is $x")
        4-> println("Value Is $x")
        in 5..45 -> println("Value Is $x")
        else ->
        {
            println("Out of Range !!")
        }
    }

}
