package com.example.demo.persistence.dao.implementation;

import com.example.demo.persistence.dao.interfaces.IUserDAO;
import com.example.demo.persistence.entity.UserEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements IUserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<UserEntity> findAll() {
        return this.entityManager.createQuery("SELECT u from UserEntity u").getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<UserEntity> findById(Long id) {
        return Optional.ofNullable(this.entityManager.find(UserEntity.class, id));
    }

    @Override
    @Transactional
    public void saveUser(UserEntity userEntity) {
        this.entityManager.persist(userEntity);
        this.entityManager.flush();
    }

    @Override
    @Transactional
    public void updateUser(UserEntity userEntity) {
        this.entityManager.merge(userEntity);
    }

    @Override
    @Transactional
    public void deleteUser(UserEntity userEntity) {
        this.entityManager.remove(userEntity);
    }
}
