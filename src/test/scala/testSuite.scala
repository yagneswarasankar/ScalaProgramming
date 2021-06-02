import com.scala.girija.miscelleneous.FindSecondHighestNumber
import org.scalatest.flatspec.AnyFlatSpec

class testSuite extends AnyFlatSpec   {

  it should "Positive test for second Highest" in {
    val f = new FindSecondHighestNumber
    val list = List(34, 54, 35, 65, 43, 68, 94, 54, 25, 78)
    assert(f.secondHighest(list) == 78, "Test passed")
  }

}
