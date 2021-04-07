package com.apitest.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.apitest.test.models.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {

}
