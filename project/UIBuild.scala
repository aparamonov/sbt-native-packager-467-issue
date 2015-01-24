import sbt._
import sbt.Keys._
import play.Project._

object UIBuild  {
  val uiDirectory = SettingKey[File]("ui-directory")

  val uiSettings = Seq(

    uiDirectory <<= (baseDirectory in Compile) {
      _ / "ui"
    },

    unmanagedSourceDirectories in Compile ++= Seq(uiDirectory.value / "app")
  )
}
