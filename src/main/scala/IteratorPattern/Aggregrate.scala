package IteratorPattern

trait Aggregrate[T] {
  def iterator:Iterator[T]
}
