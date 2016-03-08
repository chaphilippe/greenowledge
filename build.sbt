scalaVersion := "2.11.6"

libraryDependencies += "io.spray" %% "spray-can" % "1.3.3"
libraryDependencies +="com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

resolvers += "spray repo" at "http://repo.spray.io"
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
