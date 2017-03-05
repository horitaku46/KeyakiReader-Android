package com.example.horiuchitakuma.keyakireader_android.blog;


public class BlogArticle {

    private String blogId;
    private String blogURL;
    private String blogTitle;
    private String blogWriter;
    private String blogImageUrl;
    private String blogUpdateTime;


    public BlogArticle(String blogTitle, String blogWriter, String blogUpdateTime) {
        super();

        this.blogTitle = blogTitle;
        this.blogWriter = blogWriter;
        this.blogUpdateTime = blogUpdateTime;
    }

    public String getBlogTitle() {
        return this.blogTitle;
    }

    public String getBlogWriter() {
        return this.blogWriter;
    }

    public String getBlogUpdateTime() {
        return this.blogUpdateTime;
    }
}
