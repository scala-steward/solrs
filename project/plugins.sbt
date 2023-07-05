ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
)

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.8")
addSbtPlugin("com.github.sbt" % "sbt-site" % "1.5.0")
addSbtPlugin("com.github.sbt" % "sbt-ghpages" % "0.8.0")
// use a newer version of paradox (site would pull in automatically an older version)
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.10.3")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.11.0")
// addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.4.0")
addDependencyTreePlugin
/*
resolvers += Resolver.bintrayIvyRepo("scalacenter", "sbt-releases")
addSbtPlugin("org.scala-sbt" % "sbt-zinc-plugin" % "1.0.0-X10")
*/
