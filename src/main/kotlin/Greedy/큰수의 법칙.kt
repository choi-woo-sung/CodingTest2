package Greedy

class `큰수의 법칙` {

    fun solution(list: Array<Int>, input: Int, block: Int): Int {
        var answer = 0
        var isRepeat = input
        var isCycle = block
        val sortList = list.sortedDescending()
        while (isRepeat != 0) {
            if (isCycle != 0) {
                answer += sortList.first()
                --isCycle
            } else {
                answer += sortList[1]
                isCycle = block
            }
            --isRepeat
        }

        return answer
    }
}

fun main() {
    println(
        `큰수의 법칙`().solution(arrayOf(2, 4, 5, 4, 6), 8, 3)
    )
}