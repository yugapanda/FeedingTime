import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.TextArea
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle

object FeedingTime extends JFXApp {
  stage = new JFXApp.PrimaryStage {
    title.value = "Hello Stage"
    width = 600
    height = 450
    scene = new Scene {
      fill = LightGreen
      val textArea = new TextArea
      textArea.prefWidth = 500
      textArea.prefHeight = 500

      val rect = new Rectangle {
        x = 25
        y = 40
        width = 100
        height = 100
        fill <== when(hover) choose Green otherwise Red
      }
      content = Seq(textArea,rect)
    }
  }
}