package mySystem.vals

import mySystem.AnyVal_

class Long_(val value: Long) extends AnyVal_[Long] with ArithmeticMixin[Long_] {
  def +(another: Long_): Long_ = Long_(value + another.value)
  def -(another: Long_): Long_ = Long_(value - another.value)
}

object Long_ {
  def apply(value: Long) = new Long_(value)

  implicit class LongOps(value: Long) {
    def L: Long_ = Long_(value)
  }
}
