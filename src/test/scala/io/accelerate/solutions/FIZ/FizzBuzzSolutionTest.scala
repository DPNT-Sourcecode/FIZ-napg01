package io.accelerate.solutions.FIZ

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FizzBuzzSolutionTest extends AnyFlatSpec with Matchers {
  behavior of "FizzBuzz"

  it should "print 'fizz' for multiples of 3" in {
    FizzBuzzSolution().fizzBuzz(3) shouldBe "fizz"
    FizzBuzzSolution().fizzBuzz(9) shouldBe "fizz"
    FizzBuzzSolution().fizzBuzz(96) shouldBe "fizz"
  }

  it should "print 'fizz' for numbers containing a 3" in {
    FizzBuzzSolution().fizzBuzz(23) shouldBe "fizz"
    FizzBuzzSolution().fizzBuzz(38) shouldBe "fizz"
  }

  it should "print 'buzz' for multiples of 5" in {
    FizzBuzzSolution().fizzBuzz(5) shouldBe "buzz"
    FizzBuzzSolution().fizzBuzz(20) shouldBe "buzz"
    FizzBuzzSolution().fizzBuzz(8000) shouldBe "buzz"
  }

  it should "print 'buzz' for numbers containing a 5" in {
    FizzBuzzSolution().fizzBuzz(52) shouldBe "buzz"
    FizzBuzzSolution().fizzBuzz(557) shouldBe "buzz"
  }

  it should "print 'fizz buzz' for multiples of 3 and 5" in {
    FizzBuzzSolution().fizzBuzz(15) shouldBe "fizz buzz"
    FizzBuzzSolution().fizzBuzz(900) shouldBe "fizz buzz"
    FizzBuzzSolution().fizzBuzz(9000) shouldBe "fizz buzz"
  }

  it should "print 'fizz buzz' for numbers containing a 3 and a 5" in {
    FizzBuzzSolution().fizzBuzz(53) shouldBe "fizz buzz"
    FizzBuzzSolution().fizzBuzz(358) shouldBe "fizz buzz"
    FizzBuzzSolution().fizzBuzz(9853) shouldBe "fizz buzz"
  }

  it should "print 'deluxe' for numbers greater than 10 where all digits are identical and even" in {
    FizzBuzzSolution().fizzBuzz(88) shouldBe "deluxe"
    FizzBuzzSolution().fizzBuzz(4444) shouldBe "deluxe"
  }

  it should "print 'deluxe' for numbers greater than 10 where all digits are identical and odd" in {
    FizzBuzzSolution().fizzBuzz(11) shouldBe "fake deluxe"
    FizzBuzzSolution().fizzBuzz(7777) shouldBe "fake deluxe"
  }

  it should "print 'deluxe' in combination" in {
    FizzBuzzSolution().fizzBuzz(55) shouldBe "buzz deluxe"
    FizzBuzzSolution().fizzBuzz(333) shouldBe "fizz deluxe"
    FizzBuzzSolution().fizzBuzz(555) shouldBe "fizz buzz deluxe"
  }

  it should "print 'fake deluxe' in combination" in {
    FizzBuzzSolution().fizzBuzz(55) shouldBe "buzz fake deluxe"
    FizzBuzzSolution().fizzBuzz(333) shouldBe "fizz fake deluxe"
    FizzBuzzSolution().fizzBuzz(555) shouldBe "fizz buzz fake deluxe"
  }

  it should "print the number for anything else" in {
    FizzBuzzSolution().fizzBuzz(1) shouldBe "1"
    FizzBuzzSolution().fizzBuzz(8) shouldBe "8"
    FizzBuzzSolution().fizzBuzz(101) shouldBe "101"
    FizzBuzzSolution().fizzBuzz(9998) shouldBe "9998"
  }
}



