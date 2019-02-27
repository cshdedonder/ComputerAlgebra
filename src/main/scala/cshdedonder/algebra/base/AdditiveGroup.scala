package cshdedonder.algebra.base

trait AdditiveGroup {
  type T

  def add(a: T)(b: T): T

  val zero: T
}
