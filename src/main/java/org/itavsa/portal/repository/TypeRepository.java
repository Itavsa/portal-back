package org.itavsa.portal.repository;

import org.itavsa.portal.entity.Type;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface TypeRepository extends CrudRepository<Type, BigInteger> {
}
