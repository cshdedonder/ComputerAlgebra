package cshdedonder.algebra.base

object RealAdditiveGroup extends AdditiveGroup {
  override type T = Double

  override def add(a: T)(b: T): T = a + b

  override val zero: T = 0.0
}
