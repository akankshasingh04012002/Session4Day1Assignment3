object Driver extends App{
  private val driverObject = new ElementExtractor
  val list = List(1, 2, 3, 4, 5, 6)
  private val element = 2
  private val result = driverObject.elementKFromEnd(list, element)
  println(result)

}
