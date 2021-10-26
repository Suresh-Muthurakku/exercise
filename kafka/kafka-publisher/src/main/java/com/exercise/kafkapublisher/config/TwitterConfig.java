package com.exercise.kafkapublisher.config;

public class TwitterConfig  implements SocialMediaConfig<String>{

    @Override
    public void start() {

    }

    @Override
    public String collect() {
        return null;
    }

    @Override
    public void stop() {

    }
}
