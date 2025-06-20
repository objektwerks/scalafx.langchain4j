package objektwerks

import scalafx.Includes.*
import scalafx.geometry.Insets
import scalafx.scene.control.{Label, TextArea, TextField}
import scalafx.scene.input.{KeyCode, KeyEvent}
import scalafx.scene.layout.{Priority, VBox}
import scalafx.scene.Cursor

final class Pane(view: View, context: Context, connector: Connector) extends VBox:
  val labelBeer = new Label():
    prefHeight = 25
    prefWidth = 50
    text = context.labelBeer

  val textBeer = new TextField():
    prefHeight = 25
    prefWidth = 100
    promptText = context.connectorPrompt
    tooltip = context.connectorPrompt
    onKeyReleased = (event: KeyEvent) =>
      view.scene.cursor = Cursor.Wait
      if event.code == KeyCode.Enter then connector.send(text.value)
      view.scene.cursor = Cursor.Default

  val labelSummary = new Label():
    prefHeight = 25
    prefWidth = 75
    text = context.labelSummary

  val textSummary = new TextArea():
    prefHeight = context.windowHeight
    prefWidth = context.windowWidth
    text <== context.summaryProperty
    wrapText = true

  padding = Insets(3, 3, 3, 3)
  spacing = 6
  children = List(labelBeer, textBeer, labelSummary, textSummary)

  VBox.setVgrow(this, Priority.Always)