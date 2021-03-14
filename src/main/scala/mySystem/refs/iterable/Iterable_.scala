package mySystem.refs.iterable

import mySystem.refs.String_
import mySystem.{AnyRef_, Any_}

trait Iterable_[T <: Any_] extends AnyRef_ {
  protected val buffer: Seq[T]

  def apply(idx: Int): T

  def ++(another: T): Iterable_[T]

  override def toString_ : String_ = String_(buffer.map(_.toString_).mkString("<", " , ", ">"))
}
