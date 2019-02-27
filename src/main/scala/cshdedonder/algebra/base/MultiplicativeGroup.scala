package cshdedonder.algebra.base

trait MultiplicativeGroup {

  type T
  val one: T

  def multiply(a: T)(b: T): T
}
