fun main() {
    //Invoking functions
    var finalString = printsString("Veronica Ndemo")
    println(finalString)
    var modulusOfNums = modulus(27,5)
    println(modulusOfNums)
    var sumOfNumsResult = sumOfNums(21,34, 4.5453213432, 67.324F)
    println(sumOfNumsResult)
    var printsFunFact = funMeFact("I am always curious")
    println(printsFunFact)


}
// prints "Hello$(name)
fun printsString(name: String): String{
    var string = "Hello" + " " + name
    return string
}
//returns the reminder of any two numbers
fun modulus(firstNum: Int,secondNum: Int): Int{
    var  modulusResult= firstNum % secondNum
    return modulusResult

}
//sum of any four given numbers
fun sumOfNums(num1: Int,num2: Int, num3: Double, num4: Float): Double{
    var resultOfSum = num1 + num2 + num3 + num4
    return resultOfSum
}
//prints interesting fact about me
fun funMeFact(string: String):String{
    var funFact = string
    return funFact
}