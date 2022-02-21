package com.knoldus

class EmptyStack[A] extends Stack[A] {

  def pop = throw new Exception("Stack is empty")

  def top = throw new Exception("Stack is empty")

  def isEmpty = true
}