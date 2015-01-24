
GlobalBuildSettings.settings

lazy val `gazer-web` = project.in(file("web")).dependsOn(`gazer-core`).aggregate(`gazer-core`)
lazy val `gazer-core` = project.in( file("core") )
