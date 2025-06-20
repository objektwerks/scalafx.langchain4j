package objektwerks

import scalafx.scene.control.Label
import scalafx.scene.layout.VBox

final class BeerPane(context: Context) extends VBox:
  val labelBeer = new Label():
    prefHeight = 25
    prefWidth = 50
    text = context.labelBeer