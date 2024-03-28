package org.example.DAO.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("springJpaTeachersService")
@Repository
@Transactional
public class SpringJpaTeachersService implements TeachersService{

    @Autowired
    private TeachersRepository teachersRepository;

    public TeachersRepository getTeachersRepository() {
        return teachersRepository;
    }

    @Override
    public List<Teachers> findAll() {
        return new ArrayList<Teachers>(teachersRepository.findAll());
    }

    @Override
    public Teachers findAddrById(int i) {
        return teachersRepository.findAddrById(i);
    }

//    @Override
//    public Optional<Teachers> findAddrById(int i) {
//        Optional<Teachers> teachers = new Optional<Teachers>(teachersRepository.findAddrById(i));
//        return teachers;
//    }
}
