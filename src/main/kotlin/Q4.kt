fun main(){
    print("Enter the number to check : ")
    val n1 = readLine()!!.toInt()
    if (n1%2==0){
        println("$n1 is EVEN !!")
    }
    else{
        println("$n1 is ODD !!")
    }
}
