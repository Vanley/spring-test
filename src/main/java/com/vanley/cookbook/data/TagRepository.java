package com.vanley.cookbook.data;

import com.vanley.cookbook.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vanley on 20/10/2016.
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
}
