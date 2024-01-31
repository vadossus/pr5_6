import kotlin.math.pow

fun main(){
    var numb1 = readLine()!!.toDouble()
    var numb2 = readLine()!!.toDouble()

    when {
        (numb1 > numb2)->numb1=(numb1+1)
        (numb2 == numb1)->numb1.pow(3)
    }
    println(numb2)
    println(numb1)
}