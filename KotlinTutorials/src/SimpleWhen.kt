fun main(args: Array<String>) {

    var x = 60

    when (x) {
        1, 7, 8, 12, 34 -> {
            println("Value is 1 or 7 or 8 or 12 or 34")
        }
        in 40..100 -> {
            println("Value is 40 to 100")
        }
        else -> {
            println("Value is out of range!")
        }
    }
}