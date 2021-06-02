package com.scala.girija.miscelleneous

class FindSecondHighestNumber {

   def secondHighest(l :List[Int]):AnyVal = {

    if (l.size >= 2) {
      var first = Math.max(l.head, l(1))
      var secondH = Math.min(l.head, l(1))

      for (i <- 2 until l.size) {
        if (first < l(i)) {
          secondH = first
          first = l(i)
        }
        else if (l(i) < first && l(i) > secondH)
          secondH = l(i)
      }
      secondH
    }
    else println("The list should contain at least two elements")
  }


}

