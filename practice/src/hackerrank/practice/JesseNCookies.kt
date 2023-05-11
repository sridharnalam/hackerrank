package hackerrank.practice

import java.util.PriorityQueue

// https://www.hackerrank.com/challenges/one-week-preparation-kit-jesse-and-cookies/problem
fun main(args: Array<String>) {
    println(cookies(9, arrayOf(2, 7, 3, 6, 4, 6)))
}

var counter = 0;
fun cookies(k: Int, A: Array<Int>): Int {
    val queue: PriorityQueue<Int> = PriorityQueue()
    queue.addAll(A)
    while (queue.peek() < k && queue.size >= 2) {
        val sum = queue.poll() + 2 * queue.poll()
        queue.offer(sum)
        counter++
    }
    return if (queue.peek() < k) -1 else counter
}

fun doSomething(k: Int, list: MutableList<Int>): Int {
    list.sort()
    if (list[0] >= k) {
        return if (counter == 0) -1 else counter
    }
    val sum = list[0] + 2 * list[1];
    list.removeAt(0)
    list.removeAt(0)
    list.add(0, sum)
    counter++
    return doSomething(k, list)
}