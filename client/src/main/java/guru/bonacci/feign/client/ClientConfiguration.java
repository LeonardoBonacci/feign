package guru.bonacci.feign.client;

import org.springframework.context.annotation.Bean;

import feign.Logger;
import feign.okhttp.OkHttpClient;

public class ClientConfiguration {

	@Bean
	public OkHttpClient client() {
		return new OkHttpClient();
	}

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
}
