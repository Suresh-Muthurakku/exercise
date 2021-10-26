package com.exercise.kafkapublisher.mapper;

import com.exercise.kafkapublisher.domain.Tweet;
import com.exercise.kafkapublisher.model.TweetDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TweetMapper {

    TweetMapper mapper = Mappers.getMapper(TweetMapper.class);
    TweetDTO convert(Tweet tweet);
    List<TweetDTO> convert(List<Tweet> tweets);
}
