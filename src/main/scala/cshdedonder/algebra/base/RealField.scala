package cshdedonder.algebra.base

object RealField extends Field {

  override type T = Double

  override def invert(x: Double): Option[Double] = x match {
    case 0 => None
    case _ => Some(1.0/x)
  }

  override def add(a: Double)(b: Double): Double = a + b

  override val zero: Double = 0.0
  override val one: Double = 1.0

  override def multiply(a: Double)(b: Double): Double = a * b
}
