package cshdedonder.algebra.base

trait AdditiveGroupElement {
  type AdditiveG <: AdditiveGroup
  type E

  def add(a: E): E

  val additiveGroup: AdditiveG
}
