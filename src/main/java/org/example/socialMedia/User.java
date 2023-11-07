package org.example.socialMedia;

import java.util.List;

public class User {
    String username;
    String password;
    List<User> friends;
    List<Post> posts;

    public User(String username, String password, List<User> friends, List<Post> posts) {
        this.username = username;
        this.password = password;
        this.friends = friends;
        this.posts = posts;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
