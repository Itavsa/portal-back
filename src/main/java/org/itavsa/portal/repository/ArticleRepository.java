package org.itavsa.portal.repository;

import org.itavsa.portal.entity.Article;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigInteger;

public interface ArticleRepository extends PagingAndSortingRepository<Article, BigInteger> {
}
