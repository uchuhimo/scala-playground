package com.uchuhimo.implicitParameter

import ImplementShow2.{baseListShow, derivedListShow}

object ImplementShowWithOverload2 {
  def log(a: List[Base]): Unit = ImplementShowWithOverload.log(a, baseListShow)
  // since type erasure, cannot overload
  //def log(a: List[Derived]): Unit = ImplementShowWithOverload.log(a, derivedListShow)
}
