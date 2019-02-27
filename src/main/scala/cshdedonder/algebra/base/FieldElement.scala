package cshdedonder.algebra.base

trait FieldElement extends RingElement {
  type F <: Field

  val field: F

  def invert(): Option[E]
  def divide(b: E): Option[E]
}
