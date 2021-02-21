package com.fnx.mongo.crm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fnx.mongo.crm.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
