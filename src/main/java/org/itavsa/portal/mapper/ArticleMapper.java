package org.itavsa.portal.mapper;

import org.itavsa.portal.dto.ArticleDTO;
import org.itavsa.portal.entity.Article;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    @Mapping(target = "type.articles", ignore = true)
    @Mapping(target = "tags.articles", ignore = true)
    @Mapping(target = "tailoredSpec", ignore = true)
    ArticleDTO toDto(Article article);

    @AfterMapping
    default void setTailoredSpecAsString(Article source, @MappingTarget ArticleDTO.ArticleDTOBuilder target) {
        target.tailoredSpec(source.getTailoredSpec().toString());
    }
}
