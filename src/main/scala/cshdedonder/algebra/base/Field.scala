package cshdedonder.algebra.base

trait Field extends Ring {

  def invert(x: T): Option[T]

  def divide(a: T, b: T): Option[T] = b match {
    case _ if b == zero => None
    case _ => invert(b) fmap multiply(a)
  }
}
