import java.lang.Exception

fun main(){
    try {
        print("Enter num1 : ")
        var tnum1: String? = readLine()
        var num1= tnum1!!.toDouble()

        print("Enter num2 : ")
        var tnum2: String? = readLine()
        var num2= tnum2!!.toDouble()

        val ops= StringBuilder("what operation do you wanna perform? \n")
            .append("Sum: S\n")
            .append("Difference: D\n")
            .append("Product: P\n")
            .append("Quotient: Q\n")
        println(ops)
        val str= readLine()
        if (str == "S"|| str == "s"){println("The sum of your values is ${addNumbers(num1,num2)}")}
        else if (str == "D"|| str == "d"){ println("The difference of your values is ${DiffNumbers(num1,num2)}")}
        else if (str == "P"|| str == "p"){ println("The product of your values is ${num1 * num2}")}
        else if (str == "Q"|| str == "q"){ println("The Quotient of your values is ${num1 / num2}")}
        else println("I don't recognize that Op Sir")
    }
    catch (e:Exception){
    println ("${e.message} is not a number")
    }

}
//defined the function outside and called it in the main function
fun addNumbers(number1:Double, number2:Double) = number1 + number2
fun DiffNumbers(number1:Double, number2:Double) = number1 - number2