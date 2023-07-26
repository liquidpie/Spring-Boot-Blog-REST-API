package com.liquidpie.blogapi.service;

import com.liquidpie.blogapi.security.UserPrincipal;
import com.liquidpie.blogapi.model.user.User;
import com.liquidpie.blogapi.payload.ApiResponse;
import com.liquidpie.blogapi.payload.InfoRequest;
import com.liquidpie.blogapi.payload.UserIdentityAvailability;
import com.liquidpie.blogapi.payload.UserProfile;
import com.liquidpie.blogapi.payload.UserSummary;

public interface UserService {

	UserSummary getCurrentUser(UserPrincipal currentUser);

	UserIdentityAvailability checkUsernameAvailability(String username);

	UserIdentityAvailability checkEmailAvailability(String email);

	UserProfile getUserProfile(String username);

	User addUser(User user);

	User updateUser(User newUser, String username, UserPrincipal currentUser);

	ApiResponse deleteUser(String username, UserPrincipal currentUser);

	ApiResponse giveAdmin(String username);

	ApiResponse removeAdmin(String username);

	UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}