package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class GenericStackTest extends AnyFlatSpec {

  val intStack = new GenericStack[Int](List(4, 7, 5, 8))

  "Condition" should "give true if the stack is empty" in {
    assert(!(intStack.isEmpty == true))
  }
  "Condition" should "give false if stack is not Empty" in {
    assert(intStack.isEmpty == false)
  }
  "Condition" should "push an element in the stack" in {
    assert(List(1, 4, 7, 5, 8) == intStack.push(1))
  }
  "Condition" should "provide top element in the stack" in {
    intStack.push(2)
    intStack.push(3)
    assert(intStack.top == 3)
  }
  "Condition" should "pop the element from the stack" in {
    intStack.push(9)
    intStack.push(2)
    assert(intStack.pop == 2)
  }
}