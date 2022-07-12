package Demo_Consuming_Thirdparty_API.MostPopularNYTArticlesAPP.models;

import Demo_Consuming_Thirdparty_API.MostPopularNYTArticlesAPP.models.Article;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class NytResponse {

    private String status;
    private String copyright;
    @JsonProperty("num_results")
    private int numResults;
    private List<Article> results;
}
