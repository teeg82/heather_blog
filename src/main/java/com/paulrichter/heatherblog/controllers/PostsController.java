package com.paulrichter.heatherblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paulrichter.heatherblog.repositories.PostRepository;


//@RequestMapping("/posts")
@Controller
public class PostsController {
	
	@Autowired
	public PostRepository postRepo;
	
//	@RequestMapping(value="/posts", method=RequestMethod.GET)
	@RequestMapping("/posts")
	public String index(Model model){
		model.addAttribute("posts", postRepo.findByPublished());
		return "posts/index";
	}
	
	@RequestMapping(value="/{post_id}", method=RequestMethod.GET)
	public String show(@PathVariable Long post_id, Model model){
		model.addAttribute("post", postRepo.findOne(post_id));
		return "posts/show";
	}
  
}