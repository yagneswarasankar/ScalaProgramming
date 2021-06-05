package com.scala.girija

object classDemo extends App {

  val cd = new classDemo("Girija","Duvvuri")
  /*println(cd.fname +" "+ cd.lName)
  val  p = new Person("Girija","Sankar")
  p.age = 45
  println(p.toString)*/


  val f = (x:Int) => x + 1
  println(f.toString())
  val k = f.compose((y:Int) => y * y)
  println(f.apply(3))
}

class classDemo (var fname:String, var lName: String)
class Person(val firstName: String, val lastName:String) {
  var age = 0
  println("The constructor starts here")
  override def toString: String = s"$firstName $lastName has age $age"
  private val Home = System.getProperty("user.home")
  def printHome(): Unit = println(s"$Home")
  def printFullName(): Unit = println(this)
  printHome()
  printFullName()
  println("you have reached the end of the constructor")

}
