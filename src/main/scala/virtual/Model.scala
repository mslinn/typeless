package virtual

case class Thing(a: String, b: Int)(implicit other: Other) extends BlargFeature1Like {
  def compute: String = other.doSomething()

  def jump() = "Holy jumping things, Batman!"
}

trait BlargFeature1Like {
  def jump(): String
}

case class Other(c: String)(implicit other: OtherLike) extends OtherLike {
  def doSomething() = other.doSomething()
}

trait OtherLike {
  def doSomething(): String
}
