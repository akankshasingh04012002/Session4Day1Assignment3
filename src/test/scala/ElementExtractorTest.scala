
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.util.{Try, Success, Failure}

class ElementExtractorTest extends AnyFlatSpec with Matchers {
  val extractor = new ElementExtractor()

  "elementKFromEnd" should "return the kth element from the end of the list" in {
    val list = List(1, 2, 3, 4, 5)
    extractor.elementKFromEnd(list, 1) shouldEqual Success(Some(5))
    extractor.elementKFromEnd(list, 2) shouldEqual Success(Some(4))
    extractor.elementKFromEnd(list, 4) shouldEqual Success(Some(2))
  }

  it should "return Failure if k is negative" in {
    val list = List(1, 2, 3, 4, 5)
    extractor.elementKFromEnd(list, -1) shouldBe a[Failure[_]]
  }

  it should "return Failure if k is greater than the length of the list" in {
    val list = List(1, 2, 3, 4, 5)
    extractor.elementKFromEnd(list, 6) shouldBe a[Failure[_]]
  }

  it should "return Failure if the list is empty" in {
    val list = List.empty[Int]
    extractor.elementKFromEnd(list, 0) shouldBe a[Failure[_]]
  }
}
