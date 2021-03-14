package mySystem

import mySystem.refs.String_

class AnyRef_ extends Any_ {
  override def toString_ : String_ = String_(s"ref_${this.hashCode}")
}
