package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.layout.VBox

final class View(context: Context, request: Request): 
  val menu = Menu(context)

  val beerPane = Pane(this, context, request)

  val rootPane = new VBox:
    spacing = 6
    padding = Insets(6)
    children = List(menu, beerPane)

  val scene = new Scene:
    root = rootPane
    stylesheets = List("/style.css")