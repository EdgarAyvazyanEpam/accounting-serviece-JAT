package com.accountant.service.accountant.repository;

import com.accountant.service.accountant.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    @Transactional
    Optional<EmployeeEntity> deleteByFileId(String id);
}
