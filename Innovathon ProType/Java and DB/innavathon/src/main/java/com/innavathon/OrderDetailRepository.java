package com.innavathon;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Create By: Emin George
 * Created On: 17/06/19
 */
public interface OrderDetailRepository extends CrudRepository<OrderDetail, Integer> {
    List<OrderDetail> findByOwnerGroup(String ownerGroup);

    @Query("select count(*) from OrderDetail where ownerGroup = :ownerGroup")
    Integer getRowCountByOwnerGroup(@Param("ownerGroup") String ownerGroup);
}


