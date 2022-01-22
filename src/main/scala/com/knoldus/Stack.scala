package com.knoldus

trait Stack[A] {
  def push(element: A): List[A]
  def pop: A
  def top: A
  def isEmpty: Boolean
}