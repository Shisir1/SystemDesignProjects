package org.example.socialMedia;

import java.util.List;

public class SocialMediaApp {
    List<User> users;

    public void addUser(User user){
        //Add user to the system
    }

    public void addPost(User user, Post post){
        //Add post to the user's posts
    }

    public void addComments(Post post, Comment comment){
        //add comment to the post's comments
    }

    public List<Post> getPosts(User user){
        //get posts of a user and their friends
        return null;
    }

    public List<Comment> getComments(Post post){
        //get comments of a post
        return null;
    }

    public void addFriend(User user1, User user2){
        //add a friend relationship between two users
    }

    //additional methods for handling likes, follows, etc.

}
