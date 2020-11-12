package dat19c.exercise.service;

import dat19c.exercise.model.Quote;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class RestConsumeService {
    final RestTemplate restTemplate;
    private String url;


    public RestConsumeService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
        this.url = "https://gturnquist-quoters.cfapps.io/api/random";
    }

    public Quote fetchSingleQuote(){
        String queryUrl = UriComponentsBuilder
                .fromUriString(url)
                .toUriString();
        // ekstra parametre kan tilføjes som .queryParam(<name>, <values>) før .toUriString()

        Quote quote = restTemplate.getForObject(queryUrl, Quote.class);
        return quote;

    }
}
