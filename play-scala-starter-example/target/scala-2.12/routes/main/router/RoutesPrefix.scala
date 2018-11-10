// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/bnmit/Downloads/play-scala-starter-example/play-scala-starter-example/conf/routes
// @DATE:Sat Nov 10 09:23:11 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
