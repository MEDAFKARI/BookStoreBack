package com.SBS.springbookseller.Service;

import com.SBS.springbookseller.DAO.entities.User;

public interface AuthenticationService {
    User signInUserAndReturnJWT(User SignInRequest);

    User signUpUserAndReturnJWT(User SignInRequest);
}
