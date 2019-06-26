package com.innavathon;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Create By: Emin George
 * Created On: 17/06/19
 */
public interface UserMasterRepository  extends CrudRepository<UserMaster, Integer> {

    @Query("select count(*) from UserMaster where ownerGroup = :ownerGroup")
    Integer getRowCountByOwnerGroup(@Param("ownerGroup") String ownerGroup);
}
