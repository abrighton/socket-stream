import sbt._

object Dependencies {

  val `socketServer-deps` = Seq(
    Akka.`akka-actor`,
    Akka.`akka-stream`,
    Akka.`akka-stream-typed`,
    Libs.`scalaTest` % Test
  )
}
