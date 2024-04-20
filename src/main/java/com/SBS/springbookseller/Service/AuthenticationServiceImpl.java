//package com.SBS.springbookseller.Service;
//
//import com.SBS.springbookseller.DAO.entities.User;
//import com.SBS.springbookseller.Security.Jwt.JwtProvider;
//import com.SBS.springbookseller.Security.UserPrincipal;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class AuthenticationServiceImpl implements AuthenticationService{
//    @Autowired
//    private AuthenticationManager authenticationManager;
//    @Autowired
//    private JwtProvider jwtProvider;
//    @Autowired
//    private UserService userService;
//
//
//    @Override
//    public User signInUserAndReturnJWT(User SignInRequest){
//        Authentication authentication= authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(SignInRequest.getUsername(),SignInRequest.getPassword())
//        );
//
//        UserPrincipal userPrincipal= (UserPrincipal) authentication.getPrincipal();
//        String jwtToken = jwtProvider.generateToken(userPrincipal);
//        User singInUser = userPrincipal.getUser();
//        singInUser.setToken(jwtToken);
//
//
//        return singInUser;
//    }
//
//
//    @Override
//    public User signUpUserAndReturnJWT(User SignUpRequest){
//        UserPrincipal userPrincipal= UserPrincipal.builder()
//                .user(userService.saveUser(SignUpRequest))
//                .username(SignUpRequest.getUsername())
//                .password(SignUpRequest.getPassword())
//                .build();
//        String jwtToken = jwtProvider.generateToken(userPrincipal);
//        User signUpUser = userPrincipal.getUser();
//        signUpUser.setToken(jwtToken);
//        return signUpUser;
//    }
//
//
//
//
//}
