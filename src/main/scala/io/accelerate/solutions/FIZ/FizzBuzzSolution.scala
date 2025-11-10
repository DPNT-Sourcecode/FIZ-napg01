package io.accelerate.solutions.FIZ

class FizzBuzzSolution {
  def fizzBuzz(number: Int): String =
    (number % 3 == 0, number % 5 == 0) match {
      case (true, true) => "fizz buzz"
      case (true, false) => "fizz"
      case (false, true) => "buzz"
      case (false, false) => number.toString
    }
}


