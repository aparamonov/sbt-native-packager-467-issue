import play.Project._
import dependencies._
import com.typesafe.sbt.packager.archetypes._
import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

libraryDependencies ++= Seq(
  jdbc,
  filters,
  mockito,
  specs2
)

playScalaSettings

UIBuild.uiSettings

scalaVersion := "2.10.4"

incOptions := incOptions.value.withNameHashing(nameHashing = true)

packageArchetype.java_server

packageBin in Debian <<= debianJDebPackaging in Debian

serverLoading in Debian := ServerLoader.Upstart

daemonUser in Linux := "guide-menu"

packageSummary := "Guide Menu website"

packageDescription := "Guide Menu website"

maintainer := "Alexey Paramonov <a.paramonov@gmail.com>"