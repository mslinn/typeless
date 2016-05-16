import impl.OtherImpl
import org.scalatest.WordSpec
import virtual.{Other, Thing}

class TestyMcTestFace extends WordSpec {
  implicit object otherLike extends OtherImpl
  implicit val other = Other("From TestyMcTestFace")

  "Test" should {
    "whatever" in {
      val thing = new Thing("a", 1)
      println(thing.compute)
    }
  }
}
