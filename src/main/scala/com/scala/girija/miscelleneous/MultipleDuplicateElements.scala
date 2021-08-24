package com.scala.girija.miscelleneous

object MultipleDuplicateElements extends App {

  val list : List[Int] = List(10, 9, 0, 10, 2, 1, 4, 4, 7, 5, 1)
  val resultMap = scala.collection.mutable.Map[Int,Int]()
  for (n <- list) yield {
    if (resultMap.contains(n)) resultMap.put(n, resultMap(n) + 1)
    else resultMap.put(n, 1)

  }

  val duplicateElements  = list.toSet diff resultMap.filter{
    case(_,value) => value == 2
  }.keySet

  println(duplicateElements.toString())
}