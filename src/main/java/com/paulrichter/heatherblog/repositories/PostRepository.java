package com.paulrichter.heatherblog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.paulrichter.heatherblog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

	@Query(value = "select * FROM wp_vvmhbx_posts WHERE post_status = 'publish'", nativeQuery = true)
	public List<Post> findByPublished();
}