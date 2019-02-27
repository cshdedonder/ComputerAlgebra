package cshdedonder.algebra.base

object IntegerRing extends Ring {
  override type T = Int

  override def add(a: Int)(b: Int): Int = a + b

  override val zero: Int = 0
  override val one: Int = 1

  override def multiply(a: Int)(b: Int): Int = a * b
}
