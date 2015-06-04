package i_introduction._3_Lambdas

fun examples() {

    val sum = { x: Int, y: Int -> x + y }

    val three = sum(1, 2)

    fun apply(i: Int, f: (Int) -> Unit) = f(i)

    apply(2, { x -> x + 25 })
    //you can omit round brackets if lambda is the last argument
    apply(2) { x -> x + 25 }

    fun applyToStrangeArguments(f: (Int, Int) -> Int) = f(938, 241)

    applyToStrangeArguments(sum)

    applyToStrangeArguments({ x, y -> x + y })

    applyToStrangeArguments() { x, y -> x + y }

    applyToStrangeArguments { x, y -> x + y }
}




