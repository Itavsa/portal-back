package org.itavsa.portal.dto;

import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Value
@Builder
public class TypeDTO {
    String name;
    Set<ArticleDTO> articles;
}
