package com.scb.loanapi.userapi.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.scb.loanapi.userapi.model.UserDetail;

public interface LoanUserService extends UserDetailsService {

	Optional<UserDetail> getUserDetailByEmail(String emailId);
}
