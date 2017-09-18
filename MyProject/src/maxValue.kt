fun main(args: Array<String>) {

    var x = 10
    var y = 15
    var max:Int?

    max = if(x>y) x else y

    println("Max: "+max)

    var age = 20

    var isYoung = when(age){
        30 ->true
        else -> false
    }

    println(isYoung)
}