package org.itavsa.portal.repository;

import org.itavsa.portal.entity.Picture;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface PictureRepository extends CrudRepository<Picture, BigInteger> {
}
