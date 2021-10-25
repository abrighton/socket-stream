import sbt.Keys._
import sbt._

import Dependencies._
import Settings._

lazy val socketServer = project
  .enablePlugins(DeployApp)
  .settings(buildSettings: _*)
  .settings(libraryDependencies ++= `socketServer-deps`)
