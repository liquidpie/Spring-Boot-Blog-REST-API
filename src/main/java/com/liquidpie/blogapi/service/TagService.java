package com.liquidpie.blogapi.service;

import com.liquidpie.blogapi.model.Tag;
import com.liquidpie.blogapi.security.UserPrincipal;
import com.liquidpie.blogapi.payload.ApiResponse;
import com.liquidpie.blogapi.payload.PagedResponse;

public interface TagService {

	PagedResponse<Tag> getAllTags(int page, int size);

	Tag getTag(Long id);

	Tag addTag(Tag tag, UserPrincipal currentUser);

	Tag updateTag(Long id, Tag newTag, UserPrincipal currentUser);

	ApiResponse deleteTag(Long id, UserPrincipal currentUser);

}
