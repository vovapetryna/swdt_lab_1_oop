package mySystem.vals

import mySystem.AnyVal_

class Boolean_(val value: Boolean) extends AnyVal_[Boolean] with LogicMixin[Boolean_] {
  def &(another: Boolean_): Boolean_ = Boolean_(value && another.value)
  def |(another: Boolean_): Boolean_ = Boolean_(value || another.value)
}

object Boolean_ {
  def apply(value: Boolean) = new Boolean_(value)

  implicit class BooleanOps(value: Boolean) {
    def B: Boolean_ = Boolean_(value)
  }
}
