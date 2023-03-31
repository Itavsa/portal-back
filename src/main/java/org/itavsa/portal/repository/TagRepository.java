package org.itavsa.portal.repository;

import org.itavsa.portal.entity.Tag;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface TagRepository extends CrudRepository<Tag, BigInteger> {
}
