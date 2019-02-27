package cshdedonder.algebra.base

object RealRing extends Ring {
  override type T = Double

  override def add(a: Double)(b: Double): Double = a + b

  override val zero: Double = 0.0
  override val one: Double = 1.0

  override def multiply(a: Double)(b: Double): Double = a * b
}
