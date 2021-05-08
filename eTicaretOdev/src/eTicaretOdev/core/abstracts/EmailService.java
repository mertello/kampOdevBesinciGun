package eTicaretOdev.core.abstracts;

import eTicaretOdev.entities.concrete.User;

public interface EmailService {
	boolean isValid(User user);
}
