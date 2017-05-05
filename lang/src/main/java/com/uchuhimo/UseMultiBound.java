package com.uchuhimo;

public class UseMultiBound {
  public static void main(String[] args) {
    MultiBound$.MODULE$.test(new MultiBound.AB(), new MultiBound.AB());
  }
}
