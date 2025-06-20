package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

import java.time.Duration

import ox.supervised

final class Request(context: Context):
  private val model = OpenAiChatModel
    .builder()
    .apiKey(context.requestApiKey)
    .modelName(context.requestModelName)
    .timeout(Duration.ofSeconds(30))
    .logRequests(true)
    .logResponses(true)
    .build()

  private val requestWithTopic = context.requestWithTopic

  def withTopic(topic: String): Unit =
    supervised:
      context.summaryProperty.value = model.chat(s"$requestWithTopic $topic")