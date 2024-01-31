fun main(){
    var number = readLine()!!.toInt()
    when{
        (number == 0) -> println("Ноль")
        (number == 1) -> println("Один")
        (number == 2) -> println("Два")
        (number == 3) -> println("Три")
        (number == 4) -> println("Четыре")
        (number == 5) -> println("Пять")
        (number == 6) -> println("Шесть")
        (number == 7) -> println("Семь")
        (number == 8) -> println("Восемь")
        (number == 9) -> println("Девять")
    }
}