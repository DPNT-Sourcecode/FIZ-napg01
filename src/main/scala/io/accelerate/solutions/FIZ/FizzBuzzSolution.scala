package io.accelerate.solutions.FIZ

class FizzBuzzSolution {
  def fizzBuzz(number: Int): String = {
    val numberString = number.toString
    (number % 3 == 0 || numberString.contains("3"), number % 5 == 0 || numberString.contains("5")) match {
      case (true, true) => "fizz buzz"
      case (true, false) => "fizz"
      case (false, true) => "buzz"
      case (false, false) => numberString
    }
  }
}



