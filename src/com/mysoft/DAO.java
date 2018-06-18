package com.mysoft;


import java.util.ArrayList;
import java.util.List;

public class DAO {
    static List<Post> posts;
    static {
        posts = new ArrayList<>();
        posts.add(new Post(1, "hello"));
        posts.add(new Post(2, "world"));
        posts.add(new Post(3, "people"));
    }

    public static List<Post> getPosts() {
        return posts;
    }

    public static void deletePost(int id) {
        Post d =null;
        for(Post p: posts){
            if (p.id == id){
                d = p;
            }
        }
        if (d!=null){
            posts.remove(d);
        }
    }

    public static void addPost(String txt) {
        posts.add(new Post(posts.size()+1,txt));
    }
}
