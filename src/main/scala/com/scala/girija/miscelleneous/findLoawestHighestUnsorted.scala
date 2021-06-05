package com.scala.girija.miscelleneous

object findLoawestHighestUnsorted {

  def main(args: Array[String]):Unit = {

    /*val l = (0 to 100).toList
    val list = scala.util.Random.shuffle(l).take(10)*/
    val l = List(100, 58, 78, 0, -8, 48, 63, 128, 54, 56, 96, -4)
    //print(list.toString())
    try {
      var mi = l.head //Integer.MAX_VALUE
      var ma = l.head //Integer.MIN_VALUE
      val res = for (i <- l.indices) yield {

        if (l(i) < mi) mi = l(i)
        if (l(i) > ma) ma = l(i)

        (mi, ma)
      }

      val (minimum, maximum) = (res.last._1, res.last._2)
      println(s"The minimum number is : $minimum, and Maximum is $maximum")

    }
    catch{
      case e: Throwable => println("Error Occurred at some place and is " + e)
    }
  }

}
