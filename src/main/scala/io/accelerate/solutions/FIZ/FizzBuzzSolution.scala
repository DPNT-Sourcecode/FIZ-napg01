package io.accelerate.solutions.FIZ

class FizzBuzzSolution {
  def fizzBuzz(number: Int): String = {
    val numberString = number.toString
    val segments = Seq(
      Some("fizz").filter(_ => number % 3 == 0 || numberString.contains("3")),
      Some("buzz").filter(_ => number % 5 == 0 || numberString.contains("5")),
      Some("deluxe").filter(_ => number > 10 && numberString.forall(_ == numberString(0))),
    )
    if (segments.exists(_.isDefined)) {
      segments.flatMap(_.toSeq).mkString(" ")
    } else {
      numberString
    }
  }
}

