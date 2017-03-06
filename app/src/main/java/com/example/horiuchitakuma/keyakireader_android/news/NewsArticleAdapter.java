package com.example.horiuchitakuma.keyakireader_android.news;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.horiuchitakuma.keyakireader_android.constants.ConstantColor;
import com.example.horiuchitakuma.keyakireader_android.R;

import java.util.ArrayList;


enum NewsCategoryType {
    HANDSHAKE("握手会"),
    EVENTINFO("イベント情報"),
    GOODS("グッズ"),
    RELEASE("リリース"),
    TICKET("チケット"),
    MEDIA("メディア"),
    AUDITION("オーディション"),
    OTHER("その他"),
    NOT_Category("");

    private final String category;

    private NewsCategoryType(final String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.category;
    }

    public static NewsCategoryType toCategory(String category) {

        NewsCategoryType result = null;

        for (NewsCategoryType newsCategoryType:values()) {
            if (newsCategoryType.toString().equals(category)) {
                result = newsCategoryType;
                break;
            }
        }

        return result != null ? result:NOT_Category;
    }
}



public class NewsArticleAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;
    ArrayList<NewsArticle> newsArticles;

    public NewsArticleAdapter(Context context, ArrayList<NewsArticle> newsArticles) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.newsArticles = newsArticles;
    }

    @Override
    public int getCount() {
        return this.newsArticles.size();
    }

    @Override
    public Object getItem(int position) {
        return this.newsArticles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = this.layoutInflater.inflate(R.layout.list_view_news_row, parent, false);

        TextView newsTitleView = (TextView) convertView.findViewById(R.id.newsTitleView);
        newsTitleView.setText(this.newsArticles.get(position).getNewsTitle());

        TextView newsCategoryView = (TextView) convertView.findViewById(R.id.newsCategoryView);
        this.setCategoryViewBackgroundColor(newsCategoryView, this.newsArticles.get(position).getNewsCategory());
        newsCategoryView.setText(this.newsArticles.get(position).getNewsCategory());

        TextView newsUpdateTimeView = (TextView) convertView.findViewById(R.id.newsUpdateTimeView);
        newsUpdateTimeView.setText(this.newsArticles.get(position).getNewsUpdateTime());

        return convertView;
    }

    private void setCategoryViewBackgroundColor(TextView textView, String category) {

        switch (NewsCategoryType.toCategory(category)) {
            case HANDSHAKE:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.HANDSHAKE));
                break;
            case EVENTINFO:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.EVENTINFO));
                break;
            case GOODS:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.GOODS));
                break;
            case RELEASE:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.RELEASE));
                break;
            case TICKET:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.TICKET));
                break;
            case MEDIA:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.MEDIA));
                break;
            case AUDITION:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.AUDITION));
                break;
            case OTHER:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.OTHER));
                break;
            default:
                textView.setBackgroundColor(Color.parseColor(ConstantColor.OTHER));
                break;
        }
    }
}
