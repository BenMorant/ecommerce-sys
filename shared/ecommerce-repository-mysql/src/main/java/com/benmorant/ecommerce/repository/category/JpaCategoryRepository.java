package com.benmorant.ecommerce.repository.category;

import com.benmorant.ecommerce.repository.category.model.CategoryEntityImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCategoryRepository extends JpaRepository<CategoryEntityImpl, Integer> {

    CategoryEntityImpl findByCategoryName(String categoryName);

}
