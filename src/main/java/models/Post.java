package models;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post(int userId, int id, String title, String body){
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(int userId, String title, String body){
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public boolean equals(Post post){
         return userId == post.getUserId() &&
                 title.equals(post.getTitle()) && body.equals(post.getBody());
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
