package com.innavathon;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Create By: Emin George
 * Created On: 15/06/19
 */
public interface EmployeeRepository  extends CrudRepository<Employee, Integer> {

    List<Employee> findByName(String name);

}
