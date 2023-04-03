package org.itavsa.portal.repository;

import org.itavsa.portal.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigInteger;

public interface ProductRepository extends PagingAndSortingRepository<Product, BigInteger> {
}
