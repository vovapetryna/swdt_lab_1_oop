package mySystem.refs.iterable

import mySystem.Any_

class Vector_[T <: Any_](val buffer: Seq[T]) extends Iterable_[T] {
  def apply(idx: Int): T = buffer(idx)

  def ++(another: T): List_[T] = List_(buffer.+:(another))
}

object Vector_ {
  def apply[T <: Any_](buffer: Seq[T] = Seq.empty[T]) = new Vector_(buffer)
  def apply[T <: Any_](value: T)                      = new Vector_(Seq(value))

  def empty[T <: Any_]: Vector_[T] = Vector_()
}
