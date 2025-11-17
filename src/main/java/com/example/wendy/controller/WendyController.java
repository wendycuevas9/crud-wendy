
package com.example.wendy.controller;
import com.example.wendy.model.Wendy;
import com.example.wendy.repository.WendyRepository;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/wendy")
@CrossOrigin(origins="*")
public class WendyController {
 final WendyRepository repo;
 public WendyController(WendyRepository r){this.repo=r;}
 @GetMapping public List<Wendy> list(){return repo.findAll();}
 @PostMapping public Wendy create(@RequestBody Wendy w){return repo.save(w);}
 @PutMapping("/{id}") public Wendy update(@PathVariable Long id,@RequestBody Wendy w){w.setId(id);return repo.save(w);}
 @DeleteMapping("/{id}") public void del(@PathVariable Long id){repo.deleteById(id);}
}
