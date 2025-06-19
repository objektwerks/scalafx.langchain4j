package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

import java.time.Duration

final class Connector(apiKey: String, modelName: String):
  private val model = OpenAiChatModel
    .builder()
    .apiKey(apiKey)
    .modelName(modelName)
    .timeout(Duration.ofSeconds(30))
    .logRequests(true)
    .logResponses(true)
    .build()

  def send(request: String): String = model.chat(request)