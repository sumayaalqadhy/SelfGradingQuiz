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

    // Question 2
    if (studentAnswer2 == quizAnswer2) {
    points += 25
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
    points += 20
    println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.")
    } else {
    points += 1
    }

    // Question 3
    if (studentAnswer3 == quizAnswer3) {
    points += 25
    } else if (studentAnswer3 == "equilateral") {
    points += 10
    } else {
    points += 1
    }

}