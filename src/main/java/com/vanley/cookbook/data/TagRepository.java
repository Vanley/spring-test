package com.vanley.cookbook.data;

import com.vanley.cookbook.domain.Status;
import com.vanley.cookbook.domain.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vanley on 20/10/2016.
 */
@Repository
public interface TagRepository extends PagingAndSortingRepository<Tag, Integer> {
    Page<Tag> findByStatus(Status status, Pageable page);
}
