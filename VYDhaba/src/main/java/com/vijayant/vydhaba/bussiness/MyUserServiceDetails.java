package com.vijayant.vydhaba.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vijayant.vydhaba.dao.UserRepo;
import com.vijayant.vydhaba.dao.entity.User;

@Service
public class MyUserServiceDetails implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		
		User user=userRepo.findByUserId(userId);
		
		if(user==null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		
		return new UserPrincipal(user);
	}

}
