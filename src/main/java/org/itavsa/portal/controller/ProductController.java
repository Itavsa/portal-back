package org.itavsa.portal.controller;

import lombok.AllArgsConstructor;
import org.itavsa.portal.dto.ProductDTO;
import org.itavsa.portal.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> getAll(@RequestParam("page") int page, @RequestParam("size") int size) {
        Page<ProductDTO> result = this.productService.getPage(page, size);
        return result.getContent();
    }
}