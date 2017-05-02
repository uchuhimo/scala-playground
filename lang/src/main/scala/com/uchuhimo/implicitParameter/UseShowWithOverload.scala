package com.uchuhimo.implicitParameter

object UseShowWithOverload {
  import ImplementShowWithOverload.log
  // Error: reference to log is ambiguous;
  // it is imported twice in the same scope by
  // import ImplementShowWithOverload2.log
  // and import ImplementShowWithOverload.log
  //
  // A bug, see: http://www.scala-notes.org/2010/07/strange-limitation-when-importing-from-different-scopes/
  //import ImplementShowWithOverload2.log

  def main(args: Array[String]): Unit = {
    log("test")
    //log(List(new Base, new Base))
    //log(List(new Derived, new Derived))
  }
}
