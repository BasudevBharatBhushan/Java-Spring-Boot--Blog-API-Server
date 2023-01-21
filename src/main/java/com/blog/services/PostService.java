package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

public interface PostService {
	
	//Create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//Update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//Delete
	void deletePost(Integer postId);
	
	
	//Get all Posts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize);
	
	//Get Single Post
	PostDto getPostById(Integer postId);
	
	//Get All post by Category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	
	//get ALl Posts by Users
	List<PostDto>getPostsByUser(Integer userId);
	
	
	//Search Post
	List<PostDto> serachPosts(String keyword);
	
}
