import sbt.Keys._
import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import sbt.{Setting, Plugin}
import scalariform.formatter.preferences._

object GlobalBuildSettings extends Plugin {

  override lazy val settings: Seq[Setting[_]] =
    SbtScalariform.scalariformSettings ++ Seq(
      javacOptions ++= Seq("-encoding", "utf8"),
      scalacOptions ++= Seq("-deprecation", "-feature", "-Xlint", "-encoding", "utf8"),
      scalaVersion := "2.10.4",
      ScalariformKeys.preferences := ScalariformKeys.preferences.value
        .setPreference(AlignSingleLineCaseStatements, true)
        .setPreference(CompactControlReadability, true)
        .setPreference(DoubleIndentClassDeclaration, true)
        .setPreference(PreserveDanglingCloseParenthesis, true)
    )
}
