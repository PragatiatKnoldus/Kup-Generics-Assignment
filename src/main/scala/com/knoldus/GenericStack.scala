package com.knoldus

import scala.sys.error

class GenericStack[A](var stack: List[A]) extends Stack[A] {
  override def push(element: A): List[A] = {
    stack = element +: stack
    stack
  }

  override def pop: A =
    stack match {
      case List() => error("Stack is empty")
      case _ =>
        val poppedValue = stack.head
        stack = stack.tail
        poppedValue
    }

  override def top: A = if (stack.isEmpty) error("Stack is empty") else stack.head

  override def isEmpty: Boolean =
    stack match {
      case List() => true
      case _ => false
    }
}