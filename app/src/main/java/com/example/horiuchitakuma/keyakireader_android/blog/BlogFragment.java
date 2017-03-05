package com.example.horiuchitakuma.keyakireader_android.blog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.horiuchitakuma.keyakireader_android.R;

import java.util.ArrayList;


public class BlogFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View blogfragment = inflater.inflate(R.layout.fragment_blog, container, false);

        ListView listView = (ListView) blogfragment.findViewById(R.id.listView);

        ArrayList<BlogArticle> blogArticleList = new ArrayList<>();
        blogArticleList.add(new BlogArticle("葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん葵ちゃん",
                "渡辺梨加",
                "2017/03/04 33:33"));
        blogArticleList.add(new BlogArticle("べりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさべりさ",
                "渡邉理佐",
                "2017/03/04 33:33"));
        blogArticleList.add(new BlogArticle("ぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃんぺーちゃん",
                "守屋茜",
                "2017/03/04 33:33"));
        blogArticleList.add(new BlogArticle("うちの事 背負える男になれよ！",
                "守屋茜",
                "2017/03/04 33:33"));
        blogArticleList.add(new BlogArticle("必死だなw",
                "志田愛佳",
                "2017/03/04 33:33"));
        blogArticleList.add(new BlogArticle("ねぇ、謝って",
                "渡邉理佐",
                "2017/03/04 33:33"));
        BlogArticleAdapter adapter = new BlogArticleAdapter(blogfragment.getContext(), blogArticleList);

        listView.setAdapter(adapter);

        return blogfragment;
    }
}
