package cshdedonder.computeralgebra

class IntegerPolynomial(private val array: Array[Int]) extends Traversable[Int]{

  def +(p: IntegerPolynomial): IntegerPolynomial = ???
  def -(p: IntegerPolynomial): IntegerPolynomial = ???
  def *(p: IntegerPolynomial): IntegerPolynomial = ???

  def add: IntegerPolynomial => IntegerPolynomial = this.+
  def sub: IntegerPolynomial => IntegerPolynomial = this.-
  def mult: IntegerPolynomial => IntegerPolynomial = this.*

  override def foreach[U](f: Int => U): Unit = array.foreach _
}

object IntegerPolynomial {

  def apply(p: Array[Int]): IntegerPolynomial = new IntegerPolynomial(p)

  def monomial(degree: Int, value: Int = 1): IntegerPolynomial = ???

  val zero: IntegerPolynomial = IntegerPolynomial(Array())

}
