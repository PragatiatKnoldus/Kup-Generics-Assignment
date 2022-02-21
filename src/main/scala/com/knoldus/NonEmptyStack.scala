package com.knoldus

class NonEmptyStack[A](element: A, updatedStack: Stack[A]) extends Stack[A] {

  def pop: Stack[A] = updatedStack

  def top: A = element

  def isEmpty = false
}