fun main(){
    fun part1(input: List<String>):Int{
        var depth  =0;
        var hor = 0;
        for((i,j) in input.map{it.split(' ')}){
            when (i){
                "up" -> depth -= j.toInt()
                "down" -> depth += j.toInt()
                "forward" -> hor += j.toInt()
            }
        }
        return(hor * depth)
    }
    fun part2(input: List<String>):Int{
        var aim = 0;
        var hor = 0;
        var depth = 0;
        for ((i,j) in input.map{it.split(" ")}){
            when (i){
                "up" -> aim -= j.toInt()
                "down" -> aim += j.toInt()
                "forward" -> {
                    hor += j.toInt()
                    depth += aim * j.toInt()
                }
            }
            println("$depth $hor $aim")
        }
        return depth * hor
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}