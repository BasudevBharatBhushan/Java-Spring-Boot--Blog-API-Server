package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;

public interface PostService {
	
	//Create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//Update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//Delete
	void deletePost(Integer postId);
	
	
	//Get all Posts
	List<PostDto> getAllPost();
	
	//Get Single Post
	PostDto getPostById(Integer postId);
	
	//Get All post by Category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	
	//get ALl Posts by Users
	List<PostDto>getPostsByUser(Integer userId);
	
	
	//Search Post
	List<PostDto> serachPosts(String keyword);
	
}
