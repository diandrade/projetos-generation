package objects
import kotlin.math.pow
import kotlin.math.sqrt

object Calculadora {

    fun soma(n1:Int, n2:Int): Int{
        return n1 + n2

    }fun sub(n1:Int, n2:Int): Int{
        return n1 - n2

    }fun multi(n1:Int, n2:Int): Int{
        return n1 * n2

    }fun div(n1:Int, n2:Int): Int{
        return n1 / n2

    }fun pot(n1:Double, n2:Double): Double{
        return n1.pow(n2)

    }fun rad(n1:Double): Double{
        return sqrt(n1)
    }
}