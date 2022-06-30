fun main(args: Array<String>) {
    //while Loop
    var countOne = 0
    while (countOne <= 5) {
        println(countOne)
        countOne++
    }
    //Do while loop

    var countTwo = 10
    do {
        println(countTwo)
        countTwo++
    } while (countTwo <= 15)
    //Repeat loop
    repeat(5) {
        println("Good morning")
    }
    //For in loop
    var names = arrayOf("King", "Faith", "Shanky", "Linet")
    for (jina in names) {
        println(jina)
    }
    var ascendingNumbers = 0..20
    for (nambari in ascendingNumbers) {
        println(nambari)


    }
    var descendingNumbers = 20 downTo 0
    for (n in descendingNumbers) {
        println(n)

    }
}