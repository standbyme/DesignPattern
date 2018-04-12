package IteratorPattern

object Run extends App {

  case class Book(name: String)

  class BookShelfIterator(bookShelf: BookShelf) extends Iterator[Book] {
    private var index: Int = 0

    override def hasNext: Boolean = index < bookShelf.getLength

    override def next: Book = {
      val book = bookShelf.getBookAt(index)
      index += 1
      book
    }
  }

  class BookShelf(books: Array[Book]) extends Aggregrate[Book] {
    private val length: Int = books.length

    def getBookAt(index: Int): Book = books(index)

    def getLength: Int = length // 2

    override def iterator: Iterator[Book] = new BookShelfIterator(this)
  }

  val books = Array(
    Book("Cai Hongyu is a good man"),
    Book("Cai Hongyu is a very good man")
  )

  val bookShelf = new BookShelf(books)
  val it = bookShelf.iterator
  while(it.hasNext){
    val book = it.next
    println(book)
  }
}
