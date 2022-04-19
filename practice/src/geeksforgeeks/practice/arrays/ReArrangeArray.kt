package geeksforgeeks.practice.arrays

import kotlin.math.ceil

object ReArrangeArray {
    @JvmStatic
    fun main(args: Array<String>) {
//        val input  = arrayOf(1,2,3,4,5,6,7)
        val input  = arrayOf(1,2,1,4,5,6,8,8)
        println("Input : ${input.toList()}")
        input.sort()
        println("Sorted input : ${input.toList()}")
        val ceil = ceil((input.size.toDouble() / 2)).toInt()
        var i = ceil-1
        var j = ceil
        var ind = 0
        val output = arrayOfNulls<Int>(input.size)
        while (ind < input.size) {
            if (i > -1) {
                output[ind] = input[i]
            }
            if (j < input.size) {
                output[ind + 1] = input[j]
            }
            i--
            j++
            ind += 2
        }
        println("ReArranged output : ${output.toList()}")
    }
}