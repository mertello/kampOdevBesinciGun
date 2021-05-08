package eTicaretOdev.business.concrete;

import eTicaretOdev.business.abstracts.UserService;
import eTicaretOdev.core.abstracts.EmailService;
import eTicaretOdev.core.abstracts.ValidatorService;
import eTicaretOdev.entities.concrete.User;
import eTicaretOdev.dataAccess.abstracts.UserDao;

public class UserManager implements UserService {

	private UserService userService;
	private EmailService eMailService;
	private ValidatorService validatorService;
	
	
	public UserManager(UserService userService, EmailService eMailService, ValidatorService validatorService) {
		super();
		this.userService = userService;
		this.eMailService = eMailService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if(!eMailService.isValid(user)) {
			System.err.println("Register fail.");
		} 
	}

	@Override
	public void login(User user) {
		
	}

}
