package com.example.demo;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;

public class DemoApplication {

	// 직렬화: Serialize, Deserialize
	final Serde<String> stringSerde = Serdes.String();
	final Serde<Long> longSerde = Serdes.Long();
	final StreamsBuilder builder = new StreamsBuilder();
	KStream<String, String> textLines = builder.stream(
			"streams-plaintext-input",
			// Used to define optional parameters
			Consumed.with(stringSerde, stringSerde)
	);

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}
