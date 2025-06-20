package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

import java.time.Duration

import ox.supervised

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

  def sendWithTopic(topic: String): Unit =
    supervised:
      context.summaryProperty.value = model.chat(s"$request $topic")