class MinStack() {
  /** initialize your data structure here. */
  import scala.collection.mutable._
  var stack = List[Int]()

  def push(`val`: Int) {
    stack = stack ++ List(`val`)
  }

  def pop() {
    stack = stack.dropRight(1)
  }

  def top(): Int = {
    stack.last
  }

  def getMin(): Int = {
    stack.min
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */