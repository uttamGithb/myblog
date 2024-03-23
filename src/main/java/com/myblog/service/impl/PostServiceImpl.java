package com.myblog.service.impl;

import com.myblog.entity.Post;
import com.myblog.payload.PostDto;
import com.myblog.repository.PostRepository;
import com.myblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    //constructor based dependency injection...instead of @Autowired
    private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    //.....................

    @Override
   public PostDto savePost(PostDto postDto){

        //creating different methods for transfering data
//       Post post=mapToEntity(postDto);
//        Post savedPost = postRepository.save(post);
//        PostDto dto = mapToDto(savedPost);
//        return dto;


//We can directly use below code all toghether
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost = postRepository.save(post);

        PostDto dto=new PostDto();
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }



    //changing dto object to entity object
//    Post mapToEntity(PostDto postDto){
//        Post post=new Post();
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
//        return post;
//    }

    //changing entity object to dto object
//    PostDto mapToDto(Post post){
//        PostDto postDto=new PostDto();
//        postDto.setId(post.getId());
//        postDto.setTitle(post.getTitle());
//        postDto.setDescription(post.getDescription());
//        postDto.setContent(post.getContent());
//        return postDto;
//    }

}
