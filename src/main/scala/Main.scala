import virtual.Thing
import impl.OtherImpl

package object virtual {
  implicit object otherLike extends OtherImpl
  implicit val other = Other("From Main")
}

object Main extends App with BindToImpl {
  val thing = new Thing("a", 1)
  println(thing.compute)
}
