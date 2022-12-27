fun main() {

    fun printSmall(i : Int){
        println("values below 50: $i")
    }
    fun printBig(i : Int){
        println("values above 50: $i")
    }
    for ( i in 1..100 step 2){
        if(i<50){
            printSmall(i)
        }
        else
            printBig(i)
    }
}
