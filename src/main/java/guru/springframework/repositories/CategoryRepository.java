package guru.springframework.repositories;

import guru.springframework.domain.Category;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 6/13/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

  Optional<Category> findByDescription(String description);
}
