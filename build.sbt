name := "scalafx.langchain4j"
organization := "objektwerks"
version := "4.0.0"
scalaVersion := "3.6.4"
libraryDependencies ++= {
  val langchain4jVersion = "1.0.1"
  Seq(
    "org.scalafx" %% "scalafx" % "24.0.0-R35",
    "dev.langchain4j" % "langchain4j" % langchain4jVersion,
    "dev.langchain4j" % "langchain4j-open-ai" % langchain4jVersion,
    "com.softwaremill.ox" %% "core" % "0.6.1",
    "com.typesafe" % "config" % "1.4.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    "ch.qos.logback" % "logback-classic" % "1.5.18"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)