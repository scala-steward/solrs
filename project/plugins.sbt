addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.4.1")
addSbtPlugin("com.github.sbt" % "sbt-ghpages" % "0.7.0")
// use a newer version of paradox (site would pull in automatically an older version)
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.9.2")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.33")
// addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.4.0")
addDependencyTreePlugin
/*
resolvers += Resolver.bintrayIvyRepo("scalacenter", "sbt-releases")
addSbtPlugin("org.scala-sbt" % "sbt-zinc-plugin" % "1.0.0-X10")
*/
