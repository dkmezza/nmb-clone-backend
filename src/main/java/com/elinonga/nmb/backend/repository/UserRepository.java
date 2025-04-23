package com.elinonga.nmb.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.elinonga.nmb.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhoneNumber(String phoneNumber);
}
