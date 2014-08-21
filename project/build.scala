import sbt._
import Keys._


object DemoniacBuild extends Build {
  val Organization = "me.biomunky"
  val Name = "demoniac"
  val Version = "0.1.0-SNAPSHOT"
  val ScalaVersion = "2.10.4"
  val ScalatraVersion = "2.2.2"

  lazy val project = Project (
    "movement",
    file("."),
    settings = Defaults.defaultSettings ++ Seq(
      organization := Organization,
      name := Name,
      version := Version,
      scalaVersion := ScalaVersion,
      resolvers += Classpaths.typesafeReleases,
      resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
      libraryDependencies ++= Seq(
        "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
        "com.amazonaws" % "amazon-kinesis-client" % "1.0.0",
        "org.slf4j" % "slf4j-simple" % "1.7.7",
        "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT"
      )
    )
  )
}
