package com.ecjtu.flesh.model.models;

/**
 * Created by Ethan_Xiang on 2017/9/22.
 */

public class NotificationModel {
    int id;
    String title = "";
    String content = "";
    String ticker = "";
    int limit;
    String time = "";
    String timeLimit = "";
    String actionDetailUrl = "";
    int occurs = 0;
    String h5Page = "";

    public NotificationModel() {
    }

    public NotificationModel(int id, String title, String content, String ticker, int limit, String time, String timeLimit, String h5Page) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.limit = limit;
        this.time = time;
        this.timeLimit = timeLimit;
        this.ticker = ticker;
        this.h5Page = h5Page;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getActionDetailUrl() {
        return actionDetailUrl;
    }

    public void setActionDetailUrl(String actionDetailUrl) {
        this.actionDetailUrl = actionDetailUrl;
    }

    public int getOccurs() {
        return occurs;
    }

    public void setOccurs(int occurs) {
        this.occurs = occurs;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getH5Page() {
        return h5Page;
    }

    public void setH5Page(String h5Page) {
        this.h5Page = h5Page;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NotificationModel)) {
            return false;
        }
        NotificationModel local = (NotificationModel) o;

        return local.getId() == this.getId();
    }
}
