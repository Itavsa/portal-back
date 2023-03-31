package org.itavsa.portal.service;

import lombok.RequiredArgsConstructor;
import org.itavsa.portal.dto.ArticleDTO;
import org.itavsa.portal.mapper.ArticleMapper;
import org.itavsa.portal.repository.ArticleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    public Page<ArticleDTO> getPage(int page, int size) {
        return articleRepository.findAll(Pageable.ofSize(size).withPage(page)).map(articleMapper::toDto);
    }
}
