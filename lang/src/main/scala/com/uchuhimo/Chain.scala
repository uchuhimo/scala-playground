package com.uchuhimo

import scala.language.implicitConversions

object Chain {

  class A {
    val a = 1
  }

  class B {
    val b = 2
  }

  class C {
    val c = 3
  }

  implicit def aToB(a: A): B = new B

  type B1ToB[B1] = B1 => B

  implicit def bToC[T: B1ToB](b: T): C = new C


  def main(args: Array[String]): Unit = {
    val a = new A
    println(a.c)
  }
}
