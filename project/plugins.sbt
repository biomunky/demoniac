resolvers ++= Seq(
  "Maven Central"          at "http://repo1.maven.org/maven2/",
  Classpaths.typesafeResolver,
  "sbt-idea-repo"          at "http://mpeltonen.github.com/maven/",
  "gseitz@github"          at "http://gseitz.github.com/maven/",
  "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo",
  "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")
