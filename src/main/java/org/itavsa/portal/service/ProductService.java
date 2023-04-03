package org.itavsa.portal.service;

import lombok.RequiredArgsConstructor;
import org.itavsa.portal.dto.ProductDTO;
import org.itavsa.portal.mapper.ProductMapper;
import org.itavsa.portal.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public Page<ProductDTO> getPage(int page, int size) {
        return productRepository.findAll(Pageable.ofSize(size).withPage(page)).map(productMapper::toDto);
    }
}
