package cshdedonder.algebra

package object base {

  implicit class OptionMonad[A](x: Option[A]) {
    def >>=[B](f: A => Option[B]): Option[B] = x match {
      case Some(v) => f(v)
      case _ => None
    }

    def fmap[B](f: A => B): Option[B] = this >>= (pure[B] _ compose f)
  }

  def pure[A](a: A): Option[A] = Some(a)

  implicit class IntegerRingElement(val value: Int) extends RingElement {
    override type R = IntegerRing.type
    override val ring: R = IntegerRing
    override type AdditiveG = IntegerAdditiveGroup.type
    override type MultiplicativeG = IntegerMultiplicativeGroup.type
    override type E = Int

    override def multiply(b: E): E = multiplicativeGroup.multiply(value)(b.value)

    override val multiplicativeGroup: MultiplicativeG = IntegerMultiplicativeGroup

    override def add(a: E): E = additiveGroup.add(value)(a.value)

    override val additiveGroup: AdditiveG = IntegerAdditiveGroup
  }

  /*implicit class RealFieldElement(val value: Double) extends FieldElement {
    override type F = RealField.type
    override type R = RealRing.type
    override type MultiplicativeG = MultiplicativeGroup
    override type E = Double
    override type AdditiveG = AdditiveGroup
    override val field: F = RealField

    override def invert(): Option[E] = field.invert(value)

    override def divide(b: E): Option[E] = ???

    override val ring: R = RealRing

    override def multiply(b: E): E = multiplicativeGroup.multiply(value)(b.value)

    override val multiplicativeGroup: MultiplicativeG = RealMultiplicativeGroup

    override def add(a: E): E = additiveGroup.add(value)(a.value)

    override val additiveGroup: AdditiveG = RealAdditiveGroup
  }*/
}
