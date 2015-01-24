import dependencies._

libraryDependencies ++= Seq(
  mockito,
  specs2
)

incOptions := incOptions.value.withNameHashing(nameHashing = true)