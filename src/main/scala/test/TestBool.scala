package test

object TestBool extends App{

  sealed trait Bool {
    type Not <: Bool
    type && [B <: Bool] <: Bool
    type || [B <: Bool] <: Bool
    type IfElse [C, T <: C, F <: C] <: C
  }

  type True = True.type
  type False = False.type

  object True extends Bool {
    type Not = False
    type && [B <: Bool] = B
    type || [B <: Bool] = True
    type IfElse [C, T <: C, F <: C] = T
  }

  object False extends Bool {
    type Not = True
    type && [B <: Bool] = False
    type || [B <: Bool] = B
    type IfElse [C, T <: C, F <: C] = F
  }

  println(implicitly[False# Not =:= True])
  println(implicitly[False# && [True] =:= False])
  println(implicitly[False# || [True] =:= True])
  println(implicitly[False# IfElse[Any, Int, String] =:= String])

  sealed trait Nat {
    type This >: this.type <: Nat
    type ++ = Succ[This]
    type + [_ <: Nat] <: Nat
    type * [_ <: Nat] <: Nat
  }

  object Zero extends Nat {
    type This = Zero
    type + [X <: Nat] = X
    type * [X <: Nat] = Zero
  }

  class Succ[ N <: Nat] extends Nat {
    type This = Succ[N]
    type + [X <: Nat] = Succ[N# + [X]]
    type * [X <: Nat] = N# * [X]# + [X]
  }

  type Zero = Zero.type
  type One = Zero# ++
  type Two = One# ++
  type Three = Two# ++
  type Four = Three# ++
  type Five = Four# ++
  type Six = Five# ++

  implicitly[Two# + [Three] =:= Five]
  implicitly[One# + [Two] =:= Three]
  implicitly[Two# * [Two] =:= Four]

}
