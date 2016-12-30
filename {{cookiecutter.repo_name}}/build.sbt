name := "{{ cookiecutter.repo_name }}"

version := "{{ cookiecutter.version }}"

scalaVersion := "{{ cookiecutter.scala_version }}"


// A few commonly used repos, add your own as required
resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  "Typesafe repository snapshots"    at "http://repo.typesafe.com/typesafe/snapshots/",
  "Typesafe repository releases"     at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype repo"                    at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype releases"                at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype snapshots"               at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype staging"                 at "http://oss.sonatype.org/content/repositories/staging",
  "Java.net Maven2 Repository"       at "http://download.java.net/maven/2/",
  "Twitter Repository"               at "http://maven.twttr.com"
)

// Add your depenencies here

// For testing
libraryDependencies ++= {
  
 val scalaTestV = "2.2.6"

 Seq(
   "org.scalatest" %%      "scalatest" %         scalaTestV  % "test"
 )
}
