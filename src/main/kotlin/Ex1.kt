fun main() {
    var a=34
    var b=2
    println("=========== Using Third Variable ===========")
    println("\n====== Before Swapping ======")
    println("a = $a\nb = $b")
    val temp = a
    a=b
    b=temp

    println("====== After Swapping ======")
    println("a = $a\nb = $b")

    var a1 = 96
    var b1 = 56
    println("\n=========== Without Using Third Variable ===========")
    println("====== Before Swapping ======")
    println("a1 = $a1\nb1 = $b1")
    a1 = (a1 + b1)
    b1 = (a1 - b1)
    a1 = (a1 - b1)

    println("====== After Swapping ======")
    println("a1 = $a1\nb1 = $b1")
}
