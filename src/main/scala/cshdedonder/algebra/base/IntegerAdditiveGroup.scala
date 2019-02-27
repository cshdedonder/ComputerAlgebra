package cshdedonder.algebra.base

object IntegerAdditiveGroup extends AdditiveGroup {
  override type T = Int

  override def add(a: Int)(b: Int): Int = a + b

  override val zero: Int = 0
}
