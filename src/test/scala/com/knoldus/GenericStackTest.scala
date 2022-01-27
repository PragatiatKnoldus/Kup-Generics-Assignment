package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class GenericStackTest extends AnyFlatSpec {

  val intStack = new GenericStack[Int](List(4, 7, 5, 8))
  val emptyStack = new GenericStack[Nothing](List())

  // Test cases for non empty stack

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
  "Condition" should "pop an element from the stack" in {
    intStack.push(9)
    intStack.push(2)
    assert(intStack.pop == 2)
  }

  // Test cases for empty stack

  "Condition" should "give true if the stack is empty" in {
    assert(emptyStack.isEmpty == true)
  }
  "A condition" should "give exception when trying to pop an element from an empty stack" in {
    val result = "Stack is empty"
    val thrown = intercept[Exception] {
      emptyStack.pop
    }
    assert(thrown.getMessage == result)
  }
  "A condition" should "give exception when trying to find top element from an empty stack" in {
    val result = "Stack is empty"
    val thrown = intercept[Exception] {
      emptyStack.top
    }
    assert(thrown.getMessage == result)
  }
}