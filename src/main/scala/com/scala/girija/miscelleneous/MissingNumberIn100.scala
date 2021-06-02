package com.scala.girija.miscelleneous

import scala.util.control.Breaks._

object MissingNumberIn100 {

  def main(args: Array[String]): Unit = {


    /*val nums = (1 to 100).toList
    val list = scala.util.Random.shuffle(nums)
    println(list.toString)
    val nums = (1 to 100).toList
    print(nums.toString)*/

    /// In case of consecutive numbers.
    val consecutiveNums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
      11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
      21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
      31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
      41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
      51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
      61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
      71, 72, 73, 74, 75, 76, 77, /*78,*/ 79, 80,
      81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
      91, 92, 93, 94, 95, 96, 97, 98, 99, 100)

    breakable {
      for (n <- 1 to consecutiveNums.size) {
        if (consecutiveNums(n) + 1 != consecutiveNums(n + 1)) {
           print(s"${consecutiveNums(n) + 1} is the missing number in case of consecutive numbers")
          break()
        }
      }

    }

  }


  val num = List(5, 89, 43, 94, 92, 69, 99, 95, 24, 50, 46, 88, 15, 60, 96, 54,
    41, 82, 53, 55, 78, 71, 81, 67, 33, 59, 25, 49, 17, 90, 28, 93, 45,
    20, 84, 12, 10, 2, 30, 3, 14, 32, 22, 7, 11, 86, /*77,*/ 19, 47, 62, 58,
    18, 97, 65, 1, 85, 73, 21, 51, 76, 44, 100, 72, 52, 61, 57, 79, 42,
    6, 91, 27, 74, 4, 39, 34, 63, 36, 68, 70, 26, 35, 83, 37, 80, 64,
    38, 8, 40, 16, 31, 9, 75, 87, 23, 13, 29, 98, 48, 66, 56)

  //Method 1:

  val method1Result: Seq[List[Any]] = num.filter(x => x != 100).map(x => List(num.find(y => y == x - 1), x, num.find(y => y == x + 1)))
  val method1Res  = method1Result.filter(x => x(2) == None).flatten
  val method1Res1 = method1Res(1) match {
    case i: Integer => i
  }
  println(s"${method1Res1 + 1} is the missing Number")

  //Method 2:

  val method2Result = num.filterNot(x => x + 1 != 101 && num.contains(x + 1)).head
  println(s"${method2Result + 1} is the missing Number")

  //Method 3:

  val method3SumOfListElements = num.sum

  val method3SumOfAllNumbers = (1 to 100).toList.sum
  val method3missingNumber = method3SumOfAllNumbers - method3SumOfListElements
  println(s"$method3missingNumber is the missing Number")

  //Method 4 (more or less the above way)

  val method4SumOfAllElements = (100 * 101) / 2
  val method4SumOfAllNumbers = num.sum
  val method4missingNumber = method4SumOfAllElements - method4SumOfAllNumbers
  println(s"$method4missingNumber is the missing Number")

}
