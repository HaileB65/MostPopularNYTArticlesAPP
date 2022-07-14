package Demo_Consuming_Thirdparty_API.MostPopularNYTArticlesAPP.controllers;

import Demo_Consuming_Thirdparty_API.MostPopularNYTArticlesAPP.models.Article;
import Demo_Consuming_Thirdparty_API.MostPopularNYTArticlesAPP.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/articles") // starting end point in browser
public class APIArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping()
    public List<Article> home() {
        return articleService.getMostPopular();
    }
}