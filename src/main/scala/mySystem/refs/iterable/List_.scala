package mySystem.refs.iterable

import mySystem.Any_

class List_[T <: Any_](val buffer: Seq[T]) extends Iterable_[T] {
  def apply(idx: Int): T = buffer(idx)

  def ++(another: T): List_[T] = List_(buffer.+:(another))

  def head: T        = apply(0)
  def tail: List_[T] = List_(buffer.drop(1))
}

object List_ {
  def apply[T <: Any_](buffer: Seq[T] = Seq.empty[T]) = new List_(buffer)
  def apply[T <: Any_](value: T)                      = new List_(Seq(value))

  def empty[T <: Any_]: List_[T] = List_[T]()
}
