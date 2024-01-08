package com.beaution.api.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.beaution.api.user.entity.User;
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}