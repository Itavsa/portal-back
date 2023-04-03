package org.itavsa.portal.mapper;

import org.itavsa.portal.dto.ProductDTO;
import org.itavsa.portal.entity.Product;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "type.products", ignore = true)
    @Mapping(target = "tags.products", ignore = true)
    @Mapping(target = "tailoredSpec", ignore = true)
    ProductDTO toDto(Product product);

    @AfterMapping
    default void setTailoredSpecAsString(Product source, @MappingTarget ProductDTO.ProductDTOBuilder target) {
        target.tailoredSpec(source.getTailoredSpec().toString());
    }
}
