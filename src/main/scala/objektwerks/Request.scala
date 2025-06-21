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
      val startTime = System.nanoTime
      val response = model.chat(s"$requestWithTopic $topic")
      val endTime = System.nanoTime
      val elapsedTime = ( (endTime - startTime) / 1e9 ).round
      context.summaryProperty.value = s"*** Elapsed query time: $elapsedTime seconds.\n\n$response"