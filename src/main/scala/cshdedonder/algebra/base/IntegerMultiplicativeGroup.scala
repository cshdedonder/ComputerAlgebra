package cshdedonder.algebra.base

object IntegerMultiplicativeGroup extends MultiplicativeGroup {
  override type T = Int
  override val one: Int = 1

  override def multiply(a: Int)(b: Int): Int = a*b
}
