package org.itavsa.portal.controller;

import lombok.AllArgsConstructor;
import org.itavsa.portal.dto.ArticleDTO;
import org.itavsa.portal.service.ArticleService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/articles")
    public List<ArticleDTO> getAll(@RequestParam("page") int page, @RequestParam("size") int size) {
        Page<ArticleDTO> result = this.articleService.getPage(page, size);
        return result.getContent();
    }
}