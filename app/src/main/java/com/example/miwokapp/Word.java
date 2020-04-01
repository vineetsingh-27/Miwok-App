package com.example.miwokapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageresourceId;

    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageresourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageresourceId=imageresourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageresourceId() {
        return mImageresourceId;
    }
}
