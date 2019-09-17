package com.santaelf1.interfaces;

public interface GetRatingListener {
    void onStart();
    void onEnd(String success, String message, float rating);
}
