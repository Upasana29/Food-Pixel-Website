package com.recipes.service;

import com.recipes.exception.UserException;
import com.recipes.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;

}
