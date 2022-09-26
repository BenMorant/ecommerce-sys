package com.benmorant.ecommerce.repository.category;

import com.benmorant.ecommerce.core.category.CategoryEntity;

import java.util.List;

public interface CategoryRepository {

    CategoryEntity findByCategoryName(String categoryName);
    List<CategoryEntity> findAll();
    save(category);
}
