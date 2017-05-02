package com.uchuhimo.implicitParameter

object ImplementShow {
  implicit val stringShow = new Show[String] {
    def show(s: String): String = s
  }
}
