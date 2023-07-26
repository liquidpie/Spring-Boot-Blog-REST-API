package com.liquidpie.blogapi.service;

import com.liquidpie.blogapi.model.Album;
import com.liquidpie.blogapi.security.UserPrincipal;
import com.liquidpie.blogapi.payload.AlbumResponse;
import com.liquidpie.blogapi.payload.ApiResponse;
import com.liquidpie.blogapi.payload.PagedResponse;
import com.liquidpie.blogapi.payload.request.AlbumRequest;
import org.springframework.http.ResponseEntity;

public interface AlbumService {

	PagedResponse<AlbumResponse> getAllAlbums(int page, int size);

	ResponseEntity<Album> addAlbum(AlbumRequest albumRequest, UserPrincipal currentUser);

	ResponseEntity<Album> getAlbum(Long id);

	ResponseEntity<AlbumResponse> updateAlbum(Long id, AlbumRequest newAlbum, UserPrincipal currentUser);

	ResponseEntity<ApiResponse> deleteAlbum(Long id, UserPrincipal currentUser);

	PagedResponse<Album> getUserAlbums(String username, int page, int size);

}
