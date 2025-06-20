package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.control.{Label, TextArea, TextField}
import scalafx.scene.layout.{Priority, VBox}

final class BeerPane(context: Context) extends VBox:
  val labelBeer = new Label():
    prefHeight = 25
    prefWidth = 50
    text = context.labelBeer

  val textBeer = new TextField():
    prefHeight = 25
    prefWidth = 100
    promptText = "Enter a beer name or style ..."
    text = ""

  val labelSummary = new Label():
    prefHeight = 25
    prefWidth = 50
    text = context.labelSummary

  val textSummary = new TextArea():
    prefHeight = 100
    prefWidth = 300
    text <== context.summaryProperty

  padding = Insets(3, 3, 3, 3)
  spacing = 6
  children = List(labelBeer, textBeer, labelSummary, textSummary)

  VBox.setVgrow(this, Priority.Always)