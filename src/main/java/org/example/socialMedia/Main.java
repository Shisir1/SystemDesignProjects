package org.example.socialMedia;

import java.util.List;

public class Main {
    public static void main(String[] args){
        SocialMediaApp app = new SocialMediaApp();

        User user1 = new User("Shisir", "S123");
        User user2 = new User("Ramila", "R123");

        app.addUser(user1);
        app.addUser(user2);

        app.addFriend(user1,user2);

        Post post = new Post(user1, "This is my first post");
        app.addPost(user1,post);

        Comment comment = new Comment(user2,"Nice post!");
        app.addComments(post,comment);

        List<Post> user1Posts = app.getPosts(user1);
        for (Post p : user1Posts){
            System.out.println("Post by " + p.author.username + ": " + p.content);
        }

        List<Comment> postComments = app.getComments(post);
        for(Comment c : postComments){
            System.out.println("Comment by " + c.author.username + ": " + c.content);
        }
    }
}
