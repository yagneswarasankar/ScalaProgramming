package com.scala.girija.miscelleneous

object DuplicateElementInArray extends App {

  //Method 1

  val list = List(1,2,2,3,4,5,6,3)

  val len = list.length
  //var resultList = ListBuffer[Int]()
  val result = for( n <- list)  yield{
    val length = len - list.count(_ != n)
    if (length >= 2)
      n
  }
    //result.toSet.filter(_.!=()).foreach(println)


  //Method 2.

  var countMap = scala.collection.mutable.Map[Integer,Integer]()
  for (n <- list){
    if(countMap.contains(n)) {
      countMap.put(n , countMap(n) + 1)
    }
    else
      countMap.put(n,1)
  }
/*  val duplicateElementsAre = for((k,v) <-countMap) yield {
    if (v > 1)
      k
    else null
  }*/

  println(countMap.filter{case(_,v) => v > 1}.keySet.toString())

}




