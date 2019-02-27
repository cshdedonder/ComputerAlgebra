package cshdedonder.algebra.base

object RealMultiplicativeGroup extends MultiplicativeGroup {
  override type T = Double
  override val one: T = 1.0

  override def multiply(a: T)(b: T): T = a * b
}
