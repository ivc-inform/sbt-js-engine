lazy val `sbt-js-engine` = project in file(".")

description := "sbt js engine plugin"

val ssysCoreVersion = "1.5-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.typesafe" %% "jse" % "1.2.3",
  "com.typesafe" %% "npm" % "1.2.1",
  "org.specs2" %% "specs2-core" % "3.8.9" % Test,
  "org.specs2" %% "specs2-scalacheck" % "3.8.9" % Test,
  "com.simplesys.core" %% "scala-io-extender" % ssysCoreVersion,
  "junit" % "junit" % "4.12" % "test"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.5.4-SNAPSHOT")

ScriptedPlugin.projectSettings

publishMavenStyle := true

//addSbtWeb("1.5.2-SNAPSHOT")
