package com.henriquegross.hrworker.resources;


import com.henriquegross.hrworker.entities.Worker;
import com.henriquegross.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker obj = workerRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Worker> saveWorker(@RequestBody Worker worker){
        workerRepository.save(worker);
        return ResponseEntity.status(HttpStatus.CREATED).body(worker);
    }
}
