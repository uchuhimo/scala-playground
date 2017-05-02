package com.uchuhimo.implicitParameter

import ImplementShow.stringShow

object ImplementShowWithOverload {
  def log[A](a: A, s: Show[A]): Unit = println(s.show(a))
  def log(a: String): Unit = log(a, stringShow)
}
