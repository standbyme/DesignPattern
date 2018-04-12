package AdapterPattern

class PrintBannerByDelegate(string: String) extends Print {
  val banner = new Banner(string)

  override def printStrong(): Unit = banner.showWithAster()

  override def printWeak(): Unit = banner.showWithParen()
}
