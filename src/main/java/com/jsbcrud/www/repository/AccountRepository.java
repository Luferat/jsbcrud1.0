package com.jsbcrud.www.repository;

import com.jsbcrud.www.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByEmail(String email);
    Optional<Account> findById(Integer id);

    /*
    @Query(value = "SELECT * FROM account WHERE email = :email", nativeQuery = true)
    Optional<Account> findByEmail(@Param("email") String email);

    @Query(value = "SELECT * FROM account WHERE id = :id", nativeQuery = true)
    Optional<Account> findById(@Param("id") Integer id);
    */
}