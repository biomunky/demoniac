package me.biomunky.demoniac.example


import java.util.UUID
import com.amazonaws.services.kinesis.clientlibrary.lib.worker.KinesisClientLibConfiguration
import me.biomunky.demoniac.amazon.{KinesisConsumer, BasicAWSCredentialsProvider}


object Consumer {
  def main(args: Array[String]): Unit = {
    val appName = "myTestApp"
    val workerId = UUID.randomUUID.toString
    val streamName = "streamName"
    val credentials = new BasicAWSCredentialsProvider("accessKey", "secretKey")
    val kinesisClientLibConfiguration = new KinesisClientLibConfiguration(
      appName,
      streamName,
      credentials,
      workerId
    )

    def printThings(s: String): Unit = println(s)

    val kc = KinesisConsumer.withFunction(kinesisClientLibConfiguration, printThings)
  }
}
