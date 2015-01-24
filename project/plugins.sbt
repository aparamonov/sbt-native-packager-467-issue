// Comment to get more information during initialization
logLevel := Level.Warn

resolvers += "Typesafe repository"	at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.1")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.8.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.6")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")