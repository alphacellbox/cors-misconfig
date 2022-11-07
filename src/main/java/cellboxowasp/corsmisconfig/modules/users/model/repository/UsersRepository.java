package cellboxowasp.corsmisconfig.modules.users.model.repository;


import cellboxowasp.corsmisconfig.modules.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {

    // select * from users where email="..."

    @Query("select u from Users u where u.email=:email")
    Users findByQuery(@Param("email") String email);

}
