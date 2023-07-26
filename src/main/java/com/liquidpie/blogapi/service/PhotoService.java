package com.liquidpie.blogapi.service;

import com.liquidpie.blogapi.security.UserPrincipal;
import com.liquidpie.blogapi.payload.ApiResponse;
import com.liquidpie.blogapi.payload.PagedResponse;
import com.liquidpie.blogapi.payload.PhotoRequest;
import com.liquidpie.blogapi.payload.PhotoResponse;

public interface PhotoService {

	PagedResponse<PhotoResponse> getAllPhotos(int page, int size);

	PhotoResponse getPhoto(Long id);

	PhotoResponse updatePhoto(Long id, PhotoRequest photoRequest, UserPrincipal currentUser);

	PhotoResponse addPhoto(PhotoRequest photoRequest, UserPrincipal currentUser);

	ApiResponse deletePhoto(Long id, UserPrincipal currentUser);

	PagedResponse<PhotoResponse> getAllPhotosByAlbum(Long albumId, int page, int size);

}