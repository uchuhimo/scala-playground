package com.uchuhimo

object MultiBound {

  trait A

  trait B

  def test[T1 <: B, T2 <: T1 with A](t1: T1, t2: T2): Unit = {}

  class AB extends A with B

  def main(args: Array[String]): Unit = {
    test(new AB, new AB)
  }
}
