package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EmptyStackTest extends AnyFlatSpec {

  val empty = new EmptyStack[Int]

  "Condition" should "give true if the stack is empty" in {
    assert(empty.isEmpty)
  }

  "A condition" should "give exception when trying to pop an element from an empty stack" in {
    val result = "Stack is empty"
    val actualResult = intercept[Exception](empty.pop)
    assert(actualResult.getMessage == result)
  }

  "A condition" should "give exception when trying to find top element from an empty stack" in {
    val result = "Stack is empty"
    val actualResult = intercept[Exception](empty.top)
    assert(actualResult.getMessage == result)
  }

  "A condition" should "push an element in the empty stack" in {
    assert(empty.push(2).top == 2)
  }
}