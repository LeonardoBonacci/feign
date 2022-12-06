package guru.bonacci.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user-client", url="http://localhost:8080", configuration = ClientConfiguration.class)
public interface FooClient {

	@RequestMapping(value = "/foo", method = RequestMethod.GET)
	String getFoo();
}