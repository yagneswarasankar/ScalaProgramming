package com.scala.girija

object PairsSumEqualsToGivenIntgers extends App {

  val givenNumberr = 5
  val sum = 5
  val list = List(1,2,3)
  for(i <- list){
    val result = for (j <- list) yield{
      if ( i + j == givenNumberr)
          println(i,j)
    }
  }

 /* val mp = scala.collection.mutable.Map[Integer,Integer]()
  val n= list.size
  for(i <- list.indices){
    var rem= sum - list(i)
    if(mp.contains(rem)){
      val numTimes = mp.get(rem)
      for(k  <- 0 to numTimes)){
        println(rem, list(i))
      }
    }
    if(mp.contains(list(i))){
      mp.put(list(i), Integer.valueOf(mp.get(list(i))) + 1)

    }
  }*/




}
