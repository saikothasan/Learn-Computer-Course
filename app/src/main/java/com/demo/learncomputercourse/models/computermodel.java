package com.demo.learncomputercourse.models;


public class computermodel {
    int pic;
    String text;

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public int getPic() {
        return this.pic;
    }

    public void setPic(int i) {
        this.pic = i;
    }

    public computermodel(String str, int i) {
        this.text = str;
        this.pic = i;
    }
}
