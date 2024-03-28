package org.example.DAO.teacher;

import java.util.List;

public interface TeachersService {
    List<Teachers> findAll();

    Teachers findAddrById(int i);
}
