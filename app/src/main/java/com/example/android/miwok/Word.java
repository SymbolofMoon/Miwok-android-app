package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;



    public Word(String MiwokTranslation, String DefaultTranslation, int audioResourceId){
        mMiwokTranslation = MiwokTranslation;
        mDefaultTranslation = DefaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String MiwokTranslation, String DefaultTranslation, int imageResourceId, int audioResourceId){
        mMiwokTranslation = MiwokTranslation;
        mDefaultTranslation = DefaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getMiwokTranslation(){

        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
