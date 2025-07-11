name := "scalafx.langchain4j"
organization := "objektwerks"
version := "4.0.0"
scalaVersion := "3.7.2-RC1"
libraryDependencies ++= {
  val langchain4jVersion = "1.0.1"
  Seq(
    "org.scalafx" %% "scalafx" % "24.0.0-R35",
    "dev.langchain4j" % "langchain4j" % langchain4jVersion,
    "dev.langchain4j" % "langchain4j-open-ai" % langchain4jVersion,
    "com.softwaremill.ox" %% "core" % "0.7.3",
    "com.typesafe" % "config" % "1.4.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    "ch.qos.logback" % "logback-classic" % "1.5.18"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all",
  // Silences 3.7.0+ implicit using warnings:
  "-Wconf:msg=Implicit parameters should be provided with a `using` clause:s"
)
