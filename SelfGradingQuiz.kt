fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Write your code below
    println("what is 75 / 5?")
    var studentAnswer1 = Integer.valueOf(readLine())

    println("Find the value of y in 6 * 2y = 36.")
    var studentAnswer2 = Integer.valueOf(readLine())

    println("Name the type of triangle that has two equal sides")
    var studentAnswer3 = readLine()

    println("What is the value of 8 * 6 - (3 - 2)")
    var studentAnswer4 = Integer.valueOf(readLine())

    var points = 0

    if (studentAnswer1 == quizAnswer1) {
    points += 25
    }

}