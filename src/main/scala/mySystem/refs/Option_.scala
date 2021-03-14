package mySystem.refs

import mySystem.{AnyRef_, Any_}

abstract class Option_[+T <: Any_] extends AnyRef_ {
  val isEmpty: Boolean
  def get: T
}

class Some_[+T <: Any_](val value: T) extends Option_[T] {
  val isEmpty: Boolean = false
  def get: T           = value

  override def toString_ : String_ = String_(s"${this.getClass}(${value.toString_})")
}

class None_[+T <: Any_]() extends Option_[T] {
  val isEmpty: Boolean = true
  def get: T           = throw new NoSuchElementException("None.get")

  override def toString_ : String_ = String_(s"None_")
}

object Option_ {
  def apply[T <: Any_](value: T): Option_[T] = new Some_(value)
}
