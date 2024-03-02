package com.learnSphere.services;

import java.util.List;

import com.learnSphere.entity.Comments;

public interface CommentService {
	public List<Comments> commentList();
	public String addComment(Comments comment);

}
