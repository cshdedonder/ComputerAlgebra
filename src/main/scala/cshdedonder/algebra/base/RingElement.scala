package cshdedonder.algebra.base

trait RingElement extends AdditiveGroupElement with MultiplicativeGroupElement {

  type R <: Ring

  val ring: R
}
