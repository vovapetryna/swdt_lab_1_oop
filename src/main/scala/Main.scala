import mySystem.refs.Option_
import mySystem.vals.Boolean_._
import mySystem.vals.Double_._
import mySystem.vals.Int_._
import mySystem.vals.Long_._
import mySystem.refs.String_._
import mySystem.refs.iterable.{List_, Vector_}

object Main extends App {
  val myInt     = 10.I + 20.I
  val myLong    = 10.L + 20.L
  val myDouble  = 10.D + 20.D
  val myBoolean = true.B & false.B

  val myString  = "hello".S.upper

  val myOptionInt = Option_(myInt)

  val myList = List_(myLong) ++ myLong
  val myVector = Vector_(myDouble) ++ myDouble

  println(myInt.toString_)
  println(myLong.toString_)
  println(myDouble.toString_)
  println(myBoolean.toString_)

  println(myString.toString_)

  println(myOptionInt.toString_)

  println(myList.toString_)
  println(myVector.toString_)
}
