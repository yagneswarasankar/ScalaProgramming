package com.scala.girija

import com.scala.girija.miscelleneous.FindSecondHighestNumber

object Main {

  def main(args: Array[String]): Unit = {

    val list = List(34, 54, 35, 65, 43, 68, 94, 54, 25, 78)
    println(list.size)
    val fsh = new FindSecondHighestNumber
    val secondHighest = fsh.secondHighest(list)
    //println(s"The second Highest element is : ${secondHighest}")
    val fd = new ForLoopDemo()

    fd.printlist(list)


  }
}
