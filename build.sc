import mill._
import mill.scalajslib._
import mill.scalajslib.api.ModuleKind

object playground extends ScalaJSModule {
  def scalaVersion = "2.13.6"
  def scalaJSVersion = "1.7.0"

//  override def useECMAScript2015 = true

  def moduleKind = ModuleKind.CommonJSModule
}
