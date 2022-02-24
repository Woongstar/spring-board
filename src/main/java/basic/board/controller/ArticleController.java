package basic.board.controller;

import basic.board.dto.ArticleForm;
import basic.board.entity.Article;
import basic.board.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("articles/new")
    public String newArticleForm() {

        return"articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm articleForm){

        Article article = articleForm.toEntity();
        Article saved = articleRepository.save(article);

        return "";
    }

}
