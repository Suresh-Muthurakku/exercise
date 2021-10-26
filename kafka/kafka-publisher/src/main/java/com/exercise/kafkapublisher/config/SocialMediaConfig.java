package com.exercise.kafkapublisher.config;

public interface SocialMediaConfig<T> {

    void start();

    T collect();

    void stop();

}
