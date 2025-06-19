package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

import java.time.Duration

@main def runApp(args: String*): Unit =
  val apiKey = sys.env("OPENAI_API_KEY")
  val modelName = "gpt-4o-mini"

  val model = OpenAiChatModel
    .builder()
    .apiKey(apiKey)
    .modelName(modelName)
    .timeout(Duration.ofSeconds(30))
    .logRequests(true)
    .logResponses(true)
    .build()
  println(s"*** OpenAI Chat Model: $modelName")

  val topic = if args.nonEmpty then args(0) else "Indian Pale Ale"
  println(s"*** Topic: $topic")

  val request = s"Tell me about this beer style, $topic"
  println(s"*** Request: $request")

  val response = model.chat(request)
  println(s"*** Response: $response")