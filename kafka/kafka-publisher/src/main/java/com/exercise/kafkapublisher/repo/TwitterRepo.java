package com.exercise.kafkapublisher.repo;

import com.exercise.kafkapublisher.domain.Tweet;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterRepo extends ElasticsearchRepository<Tweet, String> {
}
