package com.knoldus

trait Stack[A] {
  def push(element: A): Stack[A] = new NonEmptyStack[A](element, this)

  def pop: Stack[A]

  def top: A

  def isEmpty: Boolean
}