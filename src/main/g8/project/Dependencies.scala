import sbt._

object Dependencies {
  val powerScalaVersion   = "latest.integration"
  val outrNetVersion      = "latest.integration"
  val powerScalaReflect   = "org.powerscala" %% "powerscala-reflect" % powerScalaVersion
  val powerScalaHierarchy = "org.powerscala" %% "powerscala-hierarchy" % powerScalaVersion
  val powerScalaProperty  = "org.powerscala" %% "powerscala-property" % powerScalaVersion
  val powerScalaJson      = "org.powerscala" %% "powerscala-json" % powerScalaVersion
  val outrNetCore         = "com.outr.net" %% "outrnet-core" % outrNetVersion
  val outrNetServlet      = "com.outr.net" %% "outrnet-servlet" % outrNetVersion
  val outrNetJetty        = "com.outr.net" %% "outrnet-jetty" % outrNetVersion
  val hyperscala          = "org.hyperscala" % "hyperscala-web_2.11" % "latest.integration"
  val scalaSwing          = "org.scala-lang.modules" %% "scala-swing" % "latest.release"
  val commonsCodec        = "commons-codec" % "commons-codec" % "1.9"
  val jdom                = "org.jdom" % "jdom2" % "2.0.5"
  val jaxen               = "jaxen" % "jaxen" % "1.1.6"
  val htmlcleaner         = "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.10"
  val akkaActors          = "com.typesafe.akka" %% "akka-actor" % "2.3.6"
  val uaDetector          = "net.sf.uadetector" % "uadetector-resources" % "2014.09"
  val githubCore          = "org.eclipse.mylyn.github" % "org.eclipse.egit.github.core" % "2.1.5"
  val argonaut            = "io.argonaut" %% "argonaut" % "latest.release"
  val musterJawn          = "org.json4s" %% "muster-codec-jawn" % "0.3.0"
  val musterJackson       = "org.json4s" %% "muster-codec-jackson" % "0.3.0"
  val scalaTest           = "org.scalatest" % "scalatest_2.11" % "latest.release" % "test"
  val scalaCheck          = "org.scalacheck" %% "scalacheck" % "latest.release" % "test"
}
