import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
    max4(1, 2, 3, 4)
    min3(1, 3, 4)
}

fun max3(a: Int, b: Int, c: Int): Int {
    var max = a
    if (b > max) {
        max = b
    }
    if (c > max) {
        max = c
    }
    return max
}

fun max4(a: Int, b: Int, c: Int, d: Int) {
    var max = a

    if (b > max) {
        max = b
    }
    if (c > max) {
        max = c
    }
    if (d > max) {
        max = d
    }
    println("max4($a,$b,$c,$d) = $max")
}

fun min3(a: Int, b: Int, c: Int) {
    var min = a
    if (b < min) {
        min = b
    }
    if (c < min) {
        min = c
    }
    println("min3($a,$b,$c) = $min")
}


//fun main(args: Array<String>) {
//    val sc: Scanner = Scanner(System.`in`)
//    var a = sc.nextInt()
//    var b = sc.nextInt()
//    println(a + b)
//}
