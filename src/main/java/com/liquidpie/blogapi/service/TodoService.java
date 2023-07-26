package com.liquidpie.blogapi.service;

import com.liquidpie.blogapi.model.Todo;
import com.liquidpie.blogapi.security.UserPrincipal;
import com.liquidpie.blogapi.payload.ApiResponse;
import com.liquidpie.blogapi.payload.PagedResponse;

public interface TodoService {

	Todo completeTodo(Long id, UserPrincipal currentUser);

	Todo unCompleteTodo(Long id, UserPrincipal currentUser);

	PagedResponse<Todo> getAllTodos(UserPrincipal currentUser, int page, int size);

	Todo addTodo(Todo todo, UserPrincipal currentUser);

	Todo getTodo(Long id, UserPrincipal currentUser);

	Todo updateTodo(Long id, Todo newTodo, UserPrincipal currentUser);

	ApiResponse deleteTodo(Long id, UserPrincipal currentUser);

}
