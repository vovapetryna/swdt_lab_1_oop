package mySystem

import mySystem.refs.String_

abstract class AnyVal_[T <: AnyVal] extends Any_ {
  val value: T

  override def toString_ : String_ = String_(s"${value.getClass}($value)")
}
