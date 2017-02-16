name := "scala-seed"

scalaVersion in ThisBuild := "2.11.8"

val akkaVersion = "2.4.16"
val akkaHttpVersion = "10.0.3"
val slickVersion = "3.1.1"

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % akkaVersion,
	"com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
	"com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
	"com.typesafe.akka" %% "akka-http-jackson" % akkaHttpVersion,
	"com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
	"com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
  "com.typesafe.slick" %% "slick" % slickVersion,
	"org.scalatest" %% "scalatest" % "3.0.1" % Test,
	"com.h2database" % "h2" % "1.4.190"
)
