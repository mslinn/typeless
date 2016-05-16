import impl._

trait BindToImpl {
  type BlargFeature1 = BlargFeature1Impl
  type OtherAbstract = OtherImpl
}
