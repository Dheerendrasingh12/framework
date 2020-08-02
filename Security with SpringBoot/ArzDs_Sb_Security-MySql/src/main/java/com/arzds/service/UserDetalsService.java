package com.arzds.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.arzds.config.UserRepo;
import com.arzds.details.MyUserDetails;
import com.arzds.model.User;

@Service
public class UserDetalsService implements UserDetailsService {
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> optional = repo.findByUsername(username);
	//	optional.orElseThrow(() -> new UsernameNotFoundException("Not Found " + username));
		User user = optional.get();
		return new MyUserDetails(user);
	}

}
