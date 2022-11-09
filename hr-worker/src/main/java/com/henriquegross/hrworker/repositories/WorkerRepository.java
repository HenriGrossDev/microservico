package com.henriquegross.hrworker.repositories;

import com.henriquegross.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {


}
