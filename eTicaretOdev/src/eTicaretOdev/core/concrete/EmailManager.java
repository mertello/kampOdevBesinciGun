package eTicaretOdev.core.concrete;

import eTicaretOdev.core.abstracts.ValidatorService;

public class EmailManager implements ValidatorService {

	@Override
	public void sendVerifyMail(String email) {
		System.out.println("Sending verify email to: " + email);
		System.out.println("Verify link: www.verifylink.com");
	}

	

}
