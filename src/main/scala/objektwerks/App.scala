package objektwerks

@main def runApp: Unit =
  val connector = Connector(
    apiKey = sys.env("OPENAI_API_KEY"),
    modelName = "gpt-4o-mini"
  )
  println(connector)