package com.backend.springjwt.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.springjwt.models.User;
import com.backend.springjwt.security.jwt.AuthTokenFilter;
import com.backend.springjwt.security.jwt.JwtUtils;
import com.backend.springjwt.security.services.UserDetailsServiceImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	JwtUtils jwtParser;
	@Autowired
	UserDetailsServiceImpl userService;
	@Autowired
	AuthTokenFilter token;
	@GetMapping("/profile")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public User userAccess(HttpServletRequest request) {
		String data = jwtParser.getUserNameFromJwtToken(token.parseJwt(request));
		System.out.println(data);
		return userService.loadUserInformations(data);
	}
}
