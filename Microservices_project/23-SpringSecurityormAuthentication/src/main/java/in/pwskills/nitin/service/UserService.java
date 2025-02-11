package in.pwskills.nitin.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.entity.User;
import in.pwskills.nitin.repo.UserRepo;

@Service
public class UserService implements IUserService,UserDetailsService{

	@Autowired
	UserRepo repo;
	
	@Autowired 
	BCryptPasswordEncoder passEncoder;
	
	@Override
	public Integer saveUser(User user) {
	    // Ensure password encoder is initialized
	    String password = passEncoder.encode(user.getUserPwd());
	    user.setUserPwd(password);
	    
	    // Save user and return the user ID
	    return repo.save(user).getUserId();
	}


	@Override
	public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
		System.out.println("UserServiceImpl.loadUserByUsername() is used for loading...");
		
		//load the user on the basis of email
		Optional<User> optional = repo.findByUserEmail(userEmail);
		if (optional.isPresent()) {
			
			//user object is available
			User user = optional.get();
			
			List<SimpleGrantedAuthority> authorities = 
						user.getUserRoles()
						.stream()
						.map(role-> new SimpleGrantedAuthority(role))
						.collect(Collectors.toList());
			
			//Converting to User#security object for authentication
			return new org.springframework.security.core.userdetails.User(
					userEmail, 
					user.getUserPwd(), authorities);	
		}else {
			throw new UsernameNotFoundException(userEmail+" not exists...");
		}
	}

	@Override
	public Optional<User> getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	
}
