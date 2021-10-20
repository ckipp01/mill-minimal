import mill._, scalalib._

object MillMinimal extends ScalaModule {
  def scalaVersion = "2.13.6"

  object test extends Tests {
    def ivyDeps = Agg(ivy"org.scalameta::munit:0.7.29")
    def testFrameworks = Seq("munit.Framework")
  }
}