package springboot9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.newentity;

public interface NewRepository extends JpaRepository<newentity, Long> {

}
