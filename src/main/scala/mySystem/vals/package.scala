package mySystem

package object vals {
  trait ArithmeticMixin[T <: AnyVal_[_]] {
    def +(another: T): T
    def -(another: T): T
  }

  trait LogicMixin[T <: AnyVal_[_]] {
    def &(another: T): T
    def |(another: T): T
  }
}
