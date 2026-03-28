package com.ravethlays.course.repositories;

import com.ravethlays.course.entities.Category;
import com.ravethlays.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
