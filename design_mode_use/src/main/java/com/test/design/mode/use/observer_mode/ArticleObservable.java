package com.test.design.mode.use.observer_mode;

import java.util.Observable;

/**
 * 公众号作为被观察者，当发布文章后，通知观察者
 */
public class ArticleObservable extends Observable {

    /**
     * 推文
     */
    public void pushArticle(String article){
        setChanged();
        notifyObservers(article);
    }
}