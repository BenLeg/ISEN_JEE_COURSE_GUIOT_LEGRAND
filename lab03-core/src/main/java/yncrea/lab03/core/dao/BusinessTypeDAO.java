package yncrea.lab03.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.lab03.core.entity.BusinessType;

public interface BusinessTypeDAO extends JpaRepository<BusinessType, Long> {

}
