package AdapterPattern

class PrintBannerByExtend(string: String) extends Banner(string) with Print {
  override def printWeak(): Unit = showWithParen()

  override def printStrong(): Unit = showWithAster()
}
