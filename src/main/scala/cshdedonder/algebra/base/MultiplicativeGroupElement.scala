package cshdedonder.algebra.base

trait MultiplicativeGroupElement {
  type MultiplicativeG <: MultiplicativeGroup
  type E

  def multiply(b: E): E

  val multiplicativeGroup: MultiplicativeG
}
