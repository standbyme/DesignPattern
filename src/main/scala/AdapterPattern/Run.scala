package AdapterPattern

object Run extends App {
  val printBannerByExtend = new PrintBannerByExtend("Cai Hongyu is a  good man")
  val printBannerByDelegate = new PrintBannerByDelegate("Cai Hongyu is a  good man")
  printBannerByDelegate.printStrong()
}
