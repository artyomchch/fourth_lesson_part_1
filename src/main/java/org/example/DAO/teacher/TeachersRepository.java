package org.example.DAO.teacher;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeachersRepository extends CrudRepository<Teachers, Integer> {

    List<Teachers> findAll();

    Teachers findAddrById(int length);

}
