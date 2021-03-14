package mySystem.vals

import mySystem.AnyVal_

class Int_(val value: Int) extends AnyVal_[Int] with ArithmeticMixin[Int_] {
  def +(another: Int_): Int_ = Int_(value + another.value)
  def -(another: Int_): Int_ = Int_(value - another.value)
}

object Int_ {
  def apply(value: Int) = new Int_(value)

  implicit class IntOps(value: Int) {
    def I: Int_ = Int_(value)
  }
}
