package com.exercise.kafkapublisher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TweetDTO {

    private String id;
    private Date timestamp;
    private List<String> hashTags;
    private GeoPoint coordinate;
}
