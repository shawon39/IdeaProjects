/**
 * Created by shsha on 22/06/2017.
 */

fun main(args: Array<String>) {



    for(i in 1..2){
        for (j in 1..3){
            println("Hello: $i")
        }
    }

    lol()
    lol2()
}

fun lol(){
    var count=1
    while(count<=5){
        count++
        //continue
        println("Hi !")
        ++count
        break
    }
}

fun lol2(){

    for (i in 5 downTo 1){
        println("Mr: $i")
    }

}