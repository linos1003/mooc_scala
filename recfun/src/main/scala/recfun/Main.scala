package recfun

object Main {
  def main(args: Array[String]) {
    //    println("Pascal's Triangle")
    //    for (row <- 0 to 10) {
    //      for (col <- 0 to row)
    //        print(pascal(col, row) + " ")
    //      println()
    //    }
    val string = "I told him (that it’s not (yet) done). (But he wasn’t listening)"
    println(balance(string.toList))

  }

  /**
    * Exercise 1
    */

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == c) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    var acc = 0

    def loop(chars: List[Char]): Unit = {
      if (!chars.isEmpty) {
        val x = chars.head
        if (x == '(')
          acc += 1
        else if (x == ')')
          acc -= 1
        if (acc >= 0) loop(chars.tail)
      }

    }

    loop(chars)
    acc == 0
  }

  /**
    * Exercise 3
    */


    def countChange(money: Int, coins: List[Int]): Int = {
      if(money == 0)
        1
      else if(money > 0 && !coins.isEmpty)
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      else
        0
    }

}
