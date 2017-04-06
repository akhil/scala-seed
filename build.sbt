name := "scala-seed"

scalaVersion in ThisBuild := "2.11.8"

val akkaVersion = "2.4.17"
val akkaHttpVersion = "10.0.5"
val slickVersion = "3.2.0"

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % akkaVersion withSources() withJavadoc(),
	"com.typesafe.akka" %% "akka-remote" % akkaVersion withSources() withJavadoc(),
	"com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test withSources() withJavadoc(),
	"com.typesafe.akka" %% "akka-http" % akkaHttpVersion withSources() withJavadoc(),
	"com.typesafe.akka" %% "akka-http-jackson" % akkaHttpVersion withSources() withJavadoc(),
	"com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion withSources() withJavadoc(),
	"com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test withSources() withJavadoc(),
  	"com.typesafe.slick" %% "slick" % slickVersion withSources() withJavadoc(),
	"org.scalatest" %% "scalatest" % "3.0.1" % Test withSources() withJavadoc(),
	"com.h2database" % "h2" % "1.4.190" withSources() withJavadoc()
)
