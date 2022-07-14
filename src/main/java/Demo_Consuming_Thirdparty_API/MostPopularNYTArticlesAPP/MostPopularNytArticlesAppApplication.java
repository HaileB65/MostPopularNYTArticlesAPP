package Demo_Consuming_Thirdparty_API.MostPopularNYTArticlesAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MostPopularNytArticlesAppApplication {

	// from index.html line 12. Program won't work with - th:unless="${articleList.isEmpty}" - placed on line 12.

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(MostPopularNytArticlesAppApplication.class, args);
	}

}
