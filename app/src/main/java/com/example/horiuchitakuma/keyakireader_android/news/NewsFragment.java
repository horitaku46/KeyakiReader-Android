package com.example.horiuchitakuma.keyakireader_android.news;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.horiuchitakuma.keyakireader_android.R;

import java.util.ArrayList;


public class NewsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View newsFragment = inflater.inflate(R.layout.fragment_news, container, false);
        ListView listView = (ListView) newsFragment.findViewById(R.id.listView);

        ArrayList<NewsArticle> newsArticles = new ArrayList<>();

        newsArticles.add(new NewsArticle("欅坂46 デビュー1周年記念ライブ決定!欅坂46 デビュー1周年記念ライブ決定!欅坂46 デビュー1周年記念ライブ決定!欅坂46 デビュー1周年記念ライブ決定!欅坂46 デビュー1周年記念ライブ決定!欅坂46 デビュー1周年記念ライブ決定!欅坂46 デビュー1周年記念ライブ決定!欅坂46 デビュー1周年記念ライブ決定!",
                "握手会",
                "2017.88.88"));
        newsArticles.add(new NewsArticle("欅坂46 デビュー1周年記念ライブ決定!",
                "イベント情報",
                "2017.88.88"));
        newsArticles.add(new NewsArticle("欅坂46 デビュー1周年記念ライブ決定!",
                "グッズ",
                "2017.88.88"));
        newsArticles.add(new NewsArticle("欅坂46 デビュー1周年記念ライブ決定!",
                "リリース",
                "2017.88.88"));
        newsArticles.add(new NewsArticle("欅坂46 デビュー1周年記念ライブ決定!",
                "チケット",
                "2017.88.88"));
        newsArticles.add(new NewsArticle("欅坂46 デビュー1周年記念ライブ決定!",
                "メディア",
                "2017.88.88"));
        newsArticles.add(new NewsArticle("欅坂46 デビュー1周年記念ライブ決定!",
                "オーディション",
                "2017.88.88"));
        newsArticles.add(new NewsArticle("欅坂46 デビュー1周年記念ライブ決定!",
                "その他",
                "2017.88.88"));

        NewsArticleAdapter adapter = new NewsArticleAdapter(newsFragment.getContext(), newsArticles);
        listView.setAdapter(adapter);

        return newsFragment;
    }
}
