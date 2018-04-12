package IteratorPattern

trait Iterator[T] {
  def hasNext:Boolean
  def next:T
}
