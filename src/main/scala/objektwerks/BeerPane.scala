package objektwerks

import scalafx.scene.control.{Label, TextArea, TextField}
import scalafx.scene.layout.VBox

final class BeerPane(context: Context) extends VBox:
  val labelBeer = new Label():
    prefHeight = 25
    prefWidth = 50
    text = context.labelBeer

  val textBeer = new TextField():
    prefHeight = 25
    prefWidth = 100
    text = ""

  val labelSummary = new Label():
    prefHeight = 25
    prefWidth = 50
    text = context.labelSummary

  val textSummary = new TextArea():
    prefHeight = 100
    prefWidth = 300
    text = ""