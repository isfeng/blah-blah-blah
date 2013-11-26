name := "play"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

libraryDependencies += "com.typesafe.play" %% "play-slick" % "0.5.0.8"

play.Project.playScalaSettings
