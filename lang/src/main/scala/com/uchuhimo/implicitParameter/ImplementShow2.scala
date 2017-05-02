package com.uchuhimo.implicitParameter

object ImplementShow2 {
  implicit val baseListShow = new Show[List[Base]] {
    override def show(f: List[Base]): String = "base list"
  }

  implicit val derivedListShow = new Show[List[Derived]] {
    override def show(f: List[Derived]): String = "derived list"
  }
}
