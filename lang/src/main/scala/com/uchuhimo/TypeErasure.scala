package com.uchuhimo

object TypeErasure {
  def acceptList(list: List[String]): Unit = {
  }

  // since type erasure, cannot overload
  //def acceptList(list: List[Int]): Unit = {
  //}
}
