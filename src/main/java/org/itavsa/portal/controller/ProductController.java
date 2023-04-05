package org.itavsa.portal.controller;

import lombok.AllArgsConstructor;
import org.itavsa.portal.dto.ProductDTO;
import org.itavsa.portal.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public Page<ProductDTO> getAll(Pageable pageable) {
        return this.productService.getPage(pageable);
    }
}