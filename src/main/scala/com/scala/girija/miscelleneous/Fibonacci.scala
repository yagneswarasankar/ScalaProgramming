package com.scala.girija.miscelleneous
import scala.collection.mutable.ListBuffer

object Fibonacci {

  def main(args: Array[String]): Unit ={

    febonacci(19)

  }

  def febonacci(n: Int):Unit ={

    var li = ListBuffer[Int](0,1)
    for (i <- 2 until n) yield{
      li += li(i-2)+ li(i-1)
    }

   li.take(n).foreach(x => print(x+ " "))
  }


}
