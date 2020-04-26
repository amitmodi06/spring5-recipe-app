package amit.springframework.spring5recipeapp.repositories;

import amit.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * created by KUAM on 4/27/2020
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
