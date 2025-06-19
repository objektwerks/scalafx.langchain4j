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

  def send(topic: String): String =
    val request = s"Tell me about this beer, $topic"
    model.chat(request)