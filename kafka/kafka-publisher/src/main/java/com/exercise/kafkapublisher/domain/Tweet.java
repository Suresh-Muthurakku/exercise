package com.exercise.kafkapublisher.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.elasticsearch.common.geo.GeoPoint;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "tweets")
public class Tweet {
    @Id
    private String id;

    @Field(name = "timestamp", type = FieldType.Date)
    private Date timestamp;

    @Field(name = "hashTags", type = FieldType.Keyword)
    private List<String> hashTags;

    @GeoPointField
    private GeoPoint coordinate;



}
