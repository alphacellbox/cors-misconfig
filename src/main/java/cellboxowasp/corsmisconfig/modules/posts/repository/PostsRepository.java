package cellboxowasp.corsmisconfig.modules.posts.repository;


import cellboxowasp.corsmisconfig.modules.posts.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
