package com.liquidpie.blogapi.service;

import com.liquidpie.blogapi.model.Comment;
import com.liquidpie.blogapi.security.UserPrincipal;
import com.liquidpie.blogapi.payload.ApiResponse;
import com.liquidpie.blogapi.payload.CommentRequest;
import com.liquidpie.blogapi.payload.PagedResponse;

public interface CommentService {

	PagedResponse<Comment> getAllComments(Long postId, int page, int size);

	Comment addComment(CommentRequest commentRequest, Long postId, UserPrincipal currentUser);

	Comment getComment(Long postId, Long id);

	Comment updateComment(Long postId, Long id, CommentRequest commentRequest, UserPrincipal currentUser);

	ApiResponse deleteComment(Long postId, Long id, UserPrincipal currentUser);

}
