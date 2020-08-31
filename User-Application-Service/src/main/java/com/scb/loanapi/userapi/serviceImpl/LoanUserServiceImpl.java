package com.scb.loanapi.userapi.serviceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.scb.loanapi.userapi.model.UserDetail;
import com.scb.loanapi.userapi.repoistory.LoanUserRepository;
import com.scb.loanapi.userapi.service.LoanUserService;

@Service
public class LoanUserServiceImpl implements LoanUserService {

	@Autowired
	LoanUserRepository loanUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserDetail> userDetail = loanUserRepository.findByEmailId(username);

		if (!userDetail.isPresent()) {
			throw new UsernameNotFoundException(username);
		}

		return new User(userDetail.get().getEmailId(), userDetail.get().getPassword(), true, true, true, true,
				new ArrayList<>());
	}

	@Override
	public Optional<UserDetail> getUserDetailByEmail(String emailId) {
		Optional<UserDetail> userDetail = loanUserRepository.findByEmailId(emailId);

		if (userDetail.isPresent()) {
			return userDetail;
		}else {
			throw new UsernameNotFoundException(emailId);
		}
		
	}

}
