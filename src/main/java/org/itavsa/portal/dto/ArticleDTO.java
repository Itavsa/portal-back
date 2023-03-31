package org.itavsa.portal.dto;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.util.Set;

@Value
@Builder
public class ArticleDTO {
    String title;
    BigDecimal price;
    CurrencyDTO currency;
    TypeDTO type;
    String description;
    String tailoredSpec;
    Set<PictureDTO> pictures;
    Set<TagDTO> tags;
}
