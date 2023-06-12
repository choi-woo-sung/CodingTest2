package Greedy

class `숫자 카드게임` {

    // 숫자 카드게임을 하는데 배열에서 n행 중에 가장낮은수를 뽑는데
    // 총뽑힌 카드중 가장 낮은가 나오는 n은?
    fun solution(list: Array<Array<Int>>, n: Int, m: Int): Int {
        var answer = 0
        var min = 0
        list.forEachIndexed { index, int ->
            if (min < int.min()) {
                min = int.min()
                answer = index
            }

        }

        return answer
    }
}

fun main() {
    println(
        `숫자 카드게임`().solution(
            arrayOf(arrayOf(3, 1, 2), arrayOf(4, 1, 4), arrayOf(2, 2, 2)),
            3, 3
        )
    )
}