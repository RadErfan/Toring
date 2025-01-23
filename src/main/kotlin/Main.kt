
fun main() {

    val dataClassToring = DataClassToring(
        navar = arrayListOf("a"  , "b" , "b" , "b"),
        halatePayani = setOf("q4"),
        halateShoro = "q0",
        StateHa = mapOf (Pair("q0" ,  "a") to Triple("x" , "R" , "q1"),
            Pair("q1" ,  "a") to Triple("a" , "R" , "q1"),
            Pair("q1" ,  "y") to Triple("y" , "R" , "q1"),
            Pair("q1" ,  "b") to Triple("y" , "L" , "q2"),
            Pair("q2" ,  "a") to Triple("a" , "L" , "q2"),
            Pair("q2" ,  "y") to Triple("y" , "L" , "q2"),
            Pair("q2" ,  "x") to Triple("x" , "R" , "q0"),
            Pair("q0" ,  "y") to Triple("y" , "R" , "q3"),
            Pair("q3" ,  "y") to Triple("y" , "R" , "q3"),
            Pair("q3" ,  "$") to Triple("$" , "R" , "q4"),


            )

    )

val index = 0
    val toring = Toring()
    toring.run(dataClassToring , index)


}