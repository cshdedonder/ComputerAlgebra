package test

object Test extends App {

  sealed trait Bool {
    def not: Bool
    def &&(b: Bool): Bool
    def ||(b: Bool): Bool
    def ifElse[C](t: C, f: C): C
  }

  case object True extends Bool {
    override def not = False

    override def &&(b: Bool) = b

    override def ||(b: Bool) = True

    override def ifElse[C](t: C, f: C) = t
  }

  case object False extends Bool {
    override def not = True

    override def &&(b: Bool) = False

    override def ||(b: Bool) = b

    override def ifElse[C](t: C, f: C) = f
  }

  println(False.not == True)
  println((False && True) == False)
  println((False || True) == True)
  println(False.ifElse(1,2) == 2)
}
