package in.pwskills.nitin.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FetchLatestDateFromProps {

	@Scheduled(cron = "10 * * * * *")
	public void fetch() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("{}", headers);
		
		RestTemplate rt = new RestTemplate();
		String output = rt.postForEntity(
					"http://localhost:9999/actuator/refresh", entity, String.class)
				.getBody();
		System.out.println(output);
}
}