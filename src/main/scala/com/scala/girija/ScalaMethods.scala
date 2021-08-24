package com.scala.girija

class ScalaMethods {

  def double(x:Int) :Int = x * 2

}

object ScalaMethods extends App{

  val a = List(1,2,3,4,5)
  val cm  = new ScalaMethods

  val res = a.map(cm.double)

  print(res.toString())

}