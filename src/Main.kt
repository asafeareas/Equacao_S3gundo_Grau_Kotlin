import kotlin.math.sqrt

fun main(){
    println("Digite o valor de a: ")
    var valorA = readLine()!!.toInt()

    println("Digite o valor de b: ")
    var valorB = readLine()!!.toInt()

    println("Digite o valor de c: ")
    var valorC = readLine()!!.toInt()

    var delta = valorB*valorB - 4*valorA*valorC

    if (delta < 0) {
        println("Sua equação não possui raizes reais")
    }

    else if (delta > 0) {
        var raizXUm = (- valorB + sqrt(delta.toDouble()))/(2*valorA)
        var raizXDois = (- valorB - sqrt(delta.toDouble()))/(2*valorA)
        println("x1: $raizXUm, x2: $raizXDois")
    }
}