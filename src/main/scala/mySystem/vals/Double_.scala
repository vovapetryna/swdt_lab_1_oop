package mySystem.vals

import mySystem.AnyVal_

class Double_(val value: Double) extends AnyVal_[Double] with ArithmeticMixin[Double_] {
  def +(another: Double_): Double_ = Double_(value + another.value)
  def -(another: Double_): Double_ = Double_(value - another.value)
}

object Double_ {
  def apply(value: Double) = new Double_(value)

  implicit class DoubleOps(value: Double) {
    def D: Double_ = Double_(value)
  }
}
