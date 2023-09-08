package com.burakdelice.repository;

import com.burakdelice.repository.entity.UserProfile;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserProfileRepository extends ElasticsearchRepository<UserProfile, Long> {

    boolean existsUserProfileById(Long id);
    Optional<UserProfile> findOptionalByAuthid(Long authid);

    ResponseEntity<Void> deleteOptionalByAuthid(Long authid);
}
