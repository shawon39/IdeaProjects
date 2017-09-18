
// Math Calculator

fun main(args: Array<String>) {

    println("----Math Calculator----")

    print("Enter The First Number: ")
    var x:Float = readLine()!!.toFloat()

    print("Enter The Second Number: ")
    var y:Float = readLine()!!.toFloat()

    var res :Float?
    res = x / y;

    println("Result: "+res)

}