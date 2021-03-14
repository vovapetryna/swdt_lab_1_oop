package mySystem.refs

import mySystem.AnyRef_

class String_(val value: String) extends AnyRef_ {
  def upper: String_ = String_(value.toUpperCase)
  def lower: String_ = String_(value.toLowerCase)

  override def toString: String = value
}

object String_ {
  def apply(value: String) = new String_(value)

  implicit class StringOps(value: String) {
    def S: String_ = String_(value)
  }
}
