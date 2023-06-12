package Greedy

class `1이 될 때까지` {

    fun solution(num: Int, divide: Int): Int {
        var number = num
        var answer = 0
        while (number != 1) {
            if (number % divide == 0) {
                number /= divide
            } else {
                number -= 1
            }
            answer += 1
        }

        return answer
    }
}

fun main() {
    println(
        `1이 될 때까지`().solution(25 ,5 )
    )
}