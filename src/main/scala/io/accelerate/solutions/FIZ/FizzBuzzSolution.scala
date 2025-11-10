package io.accelerate.solutions.FIZ

class FizzBuzzSolution {
  def fizzBuzz(number: Int): String = {
    val numberString = number.toString
    val isFizz = number % 3 == 0 || numberString.contains("3")
    val isBuzz = number % 5 == 0 || numberString.contains("5")
    val isDeluxe = number > 10 && numberString.forall(_ == numberString(0))
    val isFake = number % 2 == 1
    val segments = Seq(
      Some("fizz").filter(_ => isFizz),
      Some("buzz").filter(_ => isBuzz),
      Some("deluxe").filter(_ => isDeluxe && !isFake),
      Some("fake deluxe").filter(_ => isDeluxe && isFake),
    )
    if (segments.exists(_.isDefined)) {
      segments.flatMap(_.toSeq).mkString(" ")
    } else {
      numberString
    }
  }
}
