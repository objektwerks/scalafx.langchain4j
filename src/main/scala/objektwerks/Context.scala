package objektwerks

import com.typesafe.config.Config

import scalafx.beans.property.ObjectProperty
import scalafx.scene.image.Image

final class Context(config: Config):
  val summaryProperty = ObjectProperty[String]("")
  
  val requestApiKey = sys.env("OPENAI_API_KEY")
  val requestModelName = config.getString("request.modelName")
  val requestPrompt = config.getString("request.prompt")
  val requestWithTopic = config.getString("request.withTopic")

  val windowTitle = config.getString("window.title")
  val windowWidth = config.getDouble("window.width")
  val windowHeight = config.getDouble("window.height")

  val aboutAlertHeaderText = config.getString("about.alert.headerText")
  val aboutAlertContentText = config.getString("about.alert.contentText")

  val menuMenu = config.getString("menu.menu")
  val menuAbout = config.getString("menu.about")
  val menuExit = config.getString("menu.exit")

  val labelBeer = config.getString("label.beer")
  val labelSummary = config.getString("label.summary")

  def imageAppIcon: Image = Image(Image.getClass.getResourceAsStream("/icon.png"))