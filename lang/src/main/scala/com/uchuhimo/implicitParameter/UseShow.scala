package com.uchuhimo.implicitParameter

object UseShow {
  def log[A](a: A)(implicit s: Show[A]): Unit = println(s.show(a))

  def log2[A: Show](a: A): Unit = println(implicitly[Show[A]].show(a))

  import ImplementShow.stringShow
  import ImplementShow2.{baseListShow, derivedListShow}

  def logList(xs: Base*): Unit = {
    log(xs.toList)
  }

  def main(args: Array[String]): Unit = {
    log("test")
    log(List(new Base, new Base))
    log(List(new Derived, new Derived))
    logList(new Derived, new Derived)

    log2("test2")
    log2("test3")(new Show[String] {
      override def show(f: String): String = "xx"
    })
  }
}
