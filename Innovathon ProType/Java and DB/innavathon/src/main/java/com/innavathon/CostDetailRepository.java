package com.innavathon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.management.Query;

/**
 * Create By: Emin George
 * Created On: 17/06/19
 */
public interface CostDetailRepository extends CrudRepository<CostDetail, Integer> {


    CostDetail findByOwnerGroup(String ownerGroup);
}
