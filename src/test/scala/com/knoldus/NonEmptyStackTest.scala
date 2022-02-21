package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class NonEmptyStackTest extends AnyFlatSpec {

  val empty = new EmptyStack[Int]
  val intStack: Stack[Int] = empty.push(8)
  val intStack2 = new NonEmptyStack(3, intStack)

  "Condition" should "give false if stack is not Empty" in {
    assert(!intStack.isEmpty)
  }

  "Condition" should "push an element in the stack" in {
    assert(intStack.push(1).top == 1)
  }

  "Condition" should "provide top element in the stack" in {
    assert(intStack2.top == 3)
  }

  "Condition" should "pop an element from the stack" in {
    assert(intStack2.pop.top == 8)
  }
}