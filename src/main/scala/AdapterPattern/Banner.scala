package AdapterPattern

class Banner(string: String) {
  def showWithParen(): Unit = println(s"($string)")

  def showWithAster(): Unit = println(s"*$string*")
}
