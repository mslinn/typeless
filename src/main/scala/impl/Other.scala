package impl

import virtual._

trait BlargFeature1Impl extends BlargFeature1Like { this: Thing =>
  def jump(): String = "Hello from BlargFeature1Impl.jump"
}

trait OtherImpl extends OtherLike {
  def doSomething(): String = "Hello from OtherImpl.doSomething"
}
