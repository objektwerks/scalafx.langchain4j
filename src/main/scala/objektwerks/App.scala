package objektwerks

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging

import java.awt.{Taskbar, Toolkit}
import java.awt.Taskbar.Feature

import scalafx.application.JFXApp3
import scalafx.scene.image.Image

object App extends JFXApp3 with LazyLogging:
  logger.info("Starting app ...")

  val context = Context(ConfigFactory.load("app.conf"))
  val request = Request(context)

  override def start(): Unit =
    stage = new JFXApp3.PrimaryStage:
      scene = View(context, request).scene
      title = context.windowTitle
      minWidth = context.windowWidth
      minHeight = context.windowHeight
      icons += context.imageAppIcon

    if Taskbar.isTaskbarSupported() then
      val taskbar = Taskbar.getTaskbar()
      if taskbar.isSupported(Feature.ICON_IMAGE) then
        val defaultToolkit = Toolkit.getDefaultToolkit()
        val appIcon = defaultToolkit.getImage(getClass().getResource("/icon.png"))
        taskbar.setIconImage(appIcon)

    stage.show()

    logger.info("Started app.")

  sys.addShutdownHook:
    logger.info("Shutdown app.")