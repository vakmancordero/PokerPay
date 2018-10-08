package com.kaizensoftware.pokerpay.app.persistence.repository;

import com.kaizensoftware.pokerpay.app.persistence.model.auth.User;
import com.kaizensoftware.pokerpay.common.persistence.repository.SoftDeleteRepository;

import java.util.Optional;

public interface UserRepo extends SoftDeleteRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findByConfirmationToken(String confirmationToken);

}
