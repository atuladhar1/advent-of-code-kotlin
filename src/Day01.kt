fun main() {
    fun part1(input: List<String>): Int {
        var counter = 0
        for (i in 1 until input.size)
        {
            if (input[i] > input[i-1])
                counter++
        }
        return counter
    }

    fun part2(input: List<String>): Int {
        var increase = 0
        for (i in 3 until input.size){
            val a = input[i-3]+input[i-1]+input[i-2]
            val b = input[i-2]+input[i-1]+input[i]
            if (a< b)
                increase++
        }
        return increase
    }
    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
