import sbt._

object Libs {
  val `scopt`           = "com.github.scopt" %% "scopt"          % "3.7.1" //MIT License
  val `scalaTest`       = "org.scalatest"    %% "scalatest"      % "3.1.4" // ApacheV2
  val `junit-interface` = "com.novocode"     % "junit-interface" % "0.11"
  val `slf4j-api`       = "org.slf4j"        % "slf4j-api"       % "1.7.25"

}

object Akka {
  val Version               = "2.6.15" //all akka is Apache License 2.0
  val `akka-actor`          = "com.typesafe.akka" %% "akka-actor" % Version
  val `akka-stream`         = "com.typesafe.akka" %% "akka-stream" % Version
  val `akka-stream-typed`   = "com.typesafe.akka" %% "akka-stream-typed" % Version
  val `akka-testkit`        = "com.typesafe.akka" %% "akka-testkit" % Version
  val `akka-stream-testkit` = "com.typesafe.akka" %% "akka-stream-testkit" % Version
}

object AkkaHttp {
  val Version     = "10.2.4"
  val `akka-http` = "com.typesafe.akka" %% "akka-http" % Version //ApacheV2
}
