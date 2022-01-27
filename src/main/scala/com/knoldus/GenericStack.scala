package com.knoldus

class GenericStack[A](var stack: List[A]) extends Stack[A] {
  override def push(element: A): List[A] = {
    stack = element +: stack
    stack
  }

  override def pop: A =
    stack match {
      case List() => throw new Exception("Stack is empty")
      case _ =>
        val poppedValue = stack.head
        stack = stack.tail
        poppedValue
    }

  override def top: A = if (stack.isEmpty) throw new Exception("Stack is empty") else stack.head

  override def isEmpty: Boolean =
    stack match {
      case List() => true
      case _ => false
    }
}