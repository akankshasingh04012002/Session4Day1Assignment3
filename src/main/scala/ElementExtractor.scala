import scala.util.{Try, Success, Failure}

class ElementExtractor {
  def elementKFromEnd[T](list: List[T], k: Int): Try[Option[T]] = {
    if (k < 0 || k >= list.length) Failure(new IllegalArgumentException("Invalid value of k"))
    else Try(list.drop(list.length - k).headOption) match {
      case Success(value) => Success(value)
      case Failure(exception) => Failure(exception)
    }
  }
}