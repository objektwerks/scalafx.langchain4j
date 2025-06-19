name := "langchain4j"
organization := "objektwerks"
version := "5.0.0"
scalaVersion := "3.7.1"
libraryDependencies ++= {
  val langchain4jVersion = "1.0.1"
  Seq(
    "dev.langchain4j" % "langchain4j" % langchain4jVersion,
    "dev.langchain4j" % "langchain4j-open-ai" % langchain4jVersion,
    "ch.qos.logback" % "logback-classic" % "1.5.18"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)