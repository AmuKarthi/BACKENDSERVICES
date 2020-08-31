package com.scb.loanapi.userapi.repoistory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scb.loanapi.userapi.model.UserDetail;

public interface LoanUserRepository extends JpaRepository<UserDetail, Long> {

	Optional<UserDetail> findByEmailId(String emailId);
}
