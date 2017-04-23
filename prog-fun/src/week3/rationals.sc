object relationals {
  val x: Int = 1
  val x1 = new Rational(2, 3)


  x1.add(x1)

  println(x1)

  class Rational(x: Int, y: Int) {
    private val g = gcd(x, y)

    def numer = x / g

    def denom = y / g


    def neg(x: Int) = -x

    def sub(that: Rational): Rational = add(new Rational(neg(that.numer), denom))


    def add(that: Rational) = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

    override def toString: String = numer + "/" + denom

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }


}

