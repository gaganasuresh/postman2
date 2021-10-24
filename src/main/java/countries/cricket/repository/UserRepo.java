package countries.cricket.repository;

import countries.cricket.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user,Long>{
}
