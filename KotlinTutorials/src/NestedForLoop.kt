fun main(args: Array<String>) {

    for(x in 1..5) {
        println("1St For Loop, X: $x")

        for(y in 1..3) {
            println("Inner For Loop, Y: $y")
        }
        println("Inner For loop done !")
    }

    println("For loop done !")

}