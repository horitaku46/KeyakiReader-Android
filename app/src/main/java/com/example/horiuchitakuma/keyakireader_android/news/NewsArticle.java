package com.example.horiuchitakuma.keyakireader_android.news;


public class NewsArticle {

    private String newsId;
    private String newsUrl;
    private String newsTitle;
    private String newsCategory;
    private String newsUpdateTime;


    public NewsArticle(String newsTitle, String newsCategory, String newsUpdateTime) {
        super();

        this.newsTitle = newsTitle;
        this.newsCategory = newsCategory;
        this.newsUpdateTime = newsUpdateTime;
    }

    public String getNewsTitle() {
        return this.newsTitle;
    }

    public String getNewsCategory() {
        return this.newsCategory;
    }

    public String getNewsUpdateTime() {
        return this.newsUpdateTime;
    }
}
