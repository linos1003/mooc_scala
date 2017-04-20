object session {
  4 + 5

  def abs(x: Double) = if (x >= 0) x else -x

  def sqrt(x: Double) = {
    def sqrIter(guess: Double): Double = {
      if (isGoudEnough(guess)) guess
      else sqrIter(improve(guess))
    }

    def isGoudEnough(guess: Double) = (abs(guess * guess - x) / x < 0.00001)

    def improve(guess: Double) = ((x / guess) + guess) / 2

    sqrIter(1.0)
  }


  sqrt(25)
  sqrt(1)

}