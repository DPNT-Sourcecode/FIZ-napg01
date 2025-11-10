package io.accelerate.solutions.FIZ

class FizzBuzzSolution {
  def fizzBuzz(number: Int): String = {
    val numberString = number.toString
    val isFizz = number % 3 == 0 || numberString.contains("3")
    val isBuzz = number % 5 == 0 || numberString.contains("5")
    val segments = Seq(
      Some("fizz").filter(_ => isFizz),
      Some("buzz").filter(_ => isBuzz),
    )
    if (segments.exists(_.isDefined)) {
      segments.flatMap(_.toSeq).mkString(" ")
    } else {
      numberString
    }
  }
}
