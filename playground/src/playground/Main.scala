package playground

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

case class Coke(iced: Boolean) {
  def say: String = if (iced) "very cool" else "not so cool"
}

@JSExportTopLevel("Main")
object Main {
  @JSExport
  def main(): Unit = {
    val icedCoke = Coke(true)
    val normalCoke = Coke(false)
    println(icedCoke.say)
    println(normalCoke.say)
  }
}