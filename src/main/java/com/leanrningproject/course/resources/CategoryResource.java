package com.leanrningproject.course.resources;

import com.leanrningproject.course.entities.Category;
import com.leanrningproject.course.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryServices service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {

        List<Category> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")

    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
