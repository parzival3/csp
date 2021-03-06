name := "csp"

ThisBuild / version := "0.2"

ThisBuild / scalaVersion := "2.12.10"

ThisBuild / scalacOptions ++= Seq("-language:experimental.macros")
ThisBuild / scalacOptions --= Seq("-Wunused:nowarn")

ThisBuild / libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
ThisBuild / libraryDependencies += "de.sciss" %% "poirot" % "0.3.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)


lazy val svexamples: Project = (project in file("svexamples")).aggregate(root).dependsOn(root)

lazy val root = (project in file(".")).settings(
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,
)

coverageAggregate := true