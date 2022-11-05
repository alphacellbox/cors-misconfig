package cellboxowasp.corsmisconfig.modules.posts.repository;


import cellboxowasp.corsmisconfig.modules.posts.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
