package com.springpro.springpro.web;

import com.springpro.springpro.model.Person;
import com.springpro.springpro.repo.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonRepository repo;
    public PersonController(PersonRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Person> all() { return repo.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Person> get(@PathVariable Long id) {
        return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Person create(@RequestBody Person p) { return repo.save(p); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}
