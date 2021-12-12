package com.company;

public abstract class Human  {
    String Name;
    @Override
    public  int hashCode() {
        return this.Name.hashCode();
    }
    public String toString() {
        return this.Name;
    }
}
