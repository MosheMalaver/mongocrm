package com.fnx.mongo.crm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fnx.mongo.crm.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
