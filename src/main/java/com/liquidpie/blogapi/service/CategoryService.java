package com.liquidpie.blogapi.service;

import com.liquidpie.blogapi.exception.UnauthorizedException;
import com.liquidpie.blogapi.model.Category;
import com.liquidpie.blogapi.security.UserPrincipal;
import com.liquidpie.blogapi.payload.ApiResponse;
import com.liquidpie.blogapi.payload.PagedResponse;
import org.springframework.http.ResponseEntity;

public interface CategoryService {

	PagedResponse<Category> getAllCategories(int page, int size);

	ResponseEntity<Category> getCategory(Long id);

	ResponseEntity<Category> addCategory(Category category, UserPrincipal currentUser);

	ResponseEntity<Category> updateCategory(Long id, Category newCategory, UserPrincipal currentUser)
			throws UnauthorizedException;

	ResponseEntity<ApiResponse> deleteCategory(Long id, UserPrincipal currentUser) throws UnauthorizedException;

}
