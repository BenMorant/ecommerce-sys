package com.benmorant.ecommerce.repository.category;

import com.benmorant.ecommerce.core.category.CategoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CategoryRepositoryMySql implements CategoryRepository {

    private JpaCategoryRepository jpaCategoryRepository;

    @Override
    public CategoryEntity findByCategoryName(String categoryName) {
        return jpaCategoryRepository.findByCategoryName(categoryName);
    }
}
