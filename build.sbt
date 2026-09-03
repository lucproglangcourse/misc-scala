name := "misc-scala"

version := "0.0.3"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0",
  "com.github.sbt"          % "junit-interface"          % "0.13.2" % Test,
  "org.scalatest"          %% "scalatest"                % "3.2.20" % Test,
  "org.scalacheck"         %% "scalacheck"               % "1.20.0" % Test
)
