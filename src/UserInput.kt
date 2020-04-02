import java.util.Scanner

class UserInput() {
    val input = Scanner(System.`in`)

    fun userInput(): Perfomance {
        val hotWater = input.nextInt()
        val coldWater = input.nextInt()
        val t1 = input.nextInt()
        val t2 = input.nextInt()
        val t3 = input.nextInt()
        println("You enter HotWater: $hotWater, ColdWater: $coldWater, T1: $t1, T2: $t2, T3: $t3")
        return Perfomance(hotWater, coldWater, t1, t2, t3)
    }

    fun divideInput() = input.nextInt()

    fun oldPerf() = println("Enter old Perfomance in this order: HotWater, ColdWater, T1, T2, T3")

    fun newPerf() = println("Enter new Perfomance in this order: HotWater, ColdWater, T1, T2, T3")

    fun divider() = println("Enter divider")
}