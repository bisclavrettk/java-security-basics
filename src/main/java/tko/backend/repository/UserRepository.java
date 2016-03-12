package tko.backend.repository;

import org.springframework.data.repository.CrudRepository;
import tko.backend.model.User;

/**
 * Created by tomek on 12.03.16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
