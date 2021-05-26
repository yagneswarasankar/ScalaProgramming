
name := "Scala"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-clients" % "2.7.0",
  "org.apache.avro" % "avro" % "1.8.2",
  //"org.scalaz" % "scalaz-core" % "1.7.25",
  "com.typesafe" % "config" % "1.2.0",
  "org.scalactic" %% "scalactic" % "3.2.9",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test")
resolvers ++= Seq(
  "org.apache.kafka" at  "https://repo1.maven.org/maven2/",
  "org.apache.kafka.clients" at "https://repo1.maven.org/maven2/"


)





