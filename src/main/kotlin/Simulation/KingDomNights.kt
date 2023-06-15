package Simulation

class UpdownLeftlight {


    fun solution(mapSize: Int, direction: Array<String>): String {
        val maxX = mapSize
        val maxY = mapSize

        var x = 1
        var y = 1

        direction.forEach {
            when (it) {
                "L" -> if (x != 1) x -= 1
                "R" -> if (x != maxX) x += 1
                "U" -> if (y != maxY) y += 1
                "D" -> if (y != 1) y -= 1
                else -> {}
            }
        }
        return "$x $y"
    }

}