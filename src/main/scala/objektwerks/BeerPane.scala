package objektwerks

import scalafx.Includes.*
import scalafx.geometry.Insets
import scalafx.scene.control.{Label, TextArea, TextField}
import scalafx.scene.input.{KeyCode, KeyEvent}
import scalafx.scene.layout.{Priority, VBox}

final class BeerPane(context: Context, connector: Connector) extends VBox:
  val labelBeer = new Label():
    prefHeight = 25
    prefWidth = 50
    text = context.labelBeer

  val textBeer = new TextField():
    prefHeight = 25
    prefWidth = 100
    promptText = context.connectorPrompt
    onKeyReleased = (event: KeyEvent) => if event.code == KeyCode.Enter then connector.send(text.value)

  val labelSummary = new Label():
    prefHeight = 25
    prefWidth = 75
    text = context.labelSummary

  val textSummary = new TextArea():
    prefHeight = 600
    prefWidth = 600
    text <== context.summaryProperty

  padding = Insets(3, 3, 3, 3)
  spacing = 6
  children = List(labelBeer, textBeer, labelSummary, textSummary)

  VBox.setVgrow(this, Priority.Always)