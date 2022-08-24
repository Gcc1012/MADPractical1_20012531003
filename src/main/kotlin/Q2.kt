fun main() {

    val num1I: Int = 34
    val num2S: String = "12345"
    val num3S: String = "12345.456"

    val num1D = num1I.toDouble()

    val num2I = num2S.toInt()

    val num3D = num3S.toDouble()

    println("Value of num1I : ${num1I + 10}")
    println("Value of num1D : ${num1D + 10}")
    println("Value of num2S : ${num2S + 10}")
    println("Value of num2I : ${num2I + 10}")
    println("Value of num3S : ${num3S + 10}")
    println("Value of num3D : ${num3D + 10}")
}

