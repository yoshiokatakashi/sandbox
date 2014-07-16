import sbt._
import Keys._

object ApplicationBuild extends Build {
  val appDependencies = Seq(
    "postgresql" % "postgresql" % "8.4-702.jdbc4"
  )
}
