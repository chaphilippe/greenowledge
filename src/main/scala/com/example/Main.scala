package com.example

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import akka.pattern.ask
import akka.util.Timeout
import spray.can.Http

import scala.concurrent.duration._
import scala.util.Properties

object Main extends App {
  implicit val system = ActorSystem("on-spray-can")
  val service = system.actorOf(Props[MyServiceActor], "demo-service")
  val port = Properties.envOrElse("PORT", "8080").toInt
  implicit val timeout = Timeout(5.seconds)
  IO(Http) ask Http.Bind(service, interface = "0.0.0.0", port = port)
}