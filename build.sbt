name := "warik"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % "0.12.0-RC3",
  "com.datastax.oss" % "java-driver-core" % "4.1.0",
  "com.datastax.oss" % "java-driver-query-builder" % "4.1.0",
//  "com.google.guava" % "guava" % "28.0-jre"
  "com.typesafe.play" %% "play" % "2.8.0-M4"
)