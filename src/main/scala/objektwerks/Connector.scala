package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

import java.time.Duration

final class Connector(context: Context):
  private val model = OpenAiChatModel
    .builder()
    .apiKey(context.connectorApiKey)
    .modelName(context.connectorModelName)
    .timeout(Duration.ofSeconds(30))
    .logRequests(true)
    .logResponses(true)
    .build()

  private val request = context.connectorRequest

  def send(topic: String): String = model.chat(s"$request $topic")