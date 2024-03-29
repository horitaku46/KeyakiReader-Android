package com.example.horiuchitakuma.keyakireader_android.blog;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.horiuchitakuma.keyakireader_android.R;

import java.util.ArrayList;


public class BlogArticleAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;
    ArrayList<BlogArticle> blogArticles;


    public BlogArticleAdapter(Context context, ArrayList<BlogArticle> blogArticles) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.blogArticles = blogArticles;
    }

    @Override
    public int getCount() {
        return this.blogArticles.size();
    }

    @Override
    public Object getItem(int position) {
        return this.blogArticles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = this.layoutInflater.inflate(R.layout.list_view_blog_row, parent, false);

        TextView blogTitleView = (TextView) convertView.findViewById(R.id.blogTitleView);
        blogTitleView.setText(this.blogArticles.get(position).getBlogTitle());

        TextView blogWriterView = (TextView) convertView.findViewById(R.id.blogWriterView);
        blogWriterView.setText(this.blogArticles.get(position).getBlogWriter());

        TextView blogUpdateTimeView = (TextView) convertView.findViewById(R.id.blogUpdateTimeView);
        blogUpdateTimeView.setText(this.blogArticles.get(position).getBlogUpdateTime());

        return convertView;
    }
}
