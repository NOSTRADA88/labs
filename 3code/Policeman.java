package com.company;

public interface Policeman {
  default void policemenOut() {
      System.out.println("Nothing");
  };

}
