name := "scalafx.langchain4j"
organization := "objektwerks"
version := "4.0.0"
scalaVersion := "3.7.3"
libraryDependencies ++= {
  val langchain4jVersion = "1.1.0"
  Seq(
    "org.scalafx" %% "scalafx" % "24.0.2-R36",
    "dev.langchain4j" % "langchain4j" % langchain4jVersion,
    "dev.langchain4j" % "langchain4j-open-ai" % langchain4jVersion,
    "com.softwaremill.ox" %% "core" % "1.0.0",
    "com.typesafe" % "config" % "1.4.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    "ch.qos.logback" % "logback-classic" % "1.5.18"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
