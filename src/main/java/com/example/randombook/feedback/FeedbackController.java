package com.example.randombook.feedback;

import com.example.randombook.category.Category;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private final JdbcFeedbackDAO dao;

    public FeedbackController(JdbcFeedbackDAO dao) {
        this.dao = dao;
    }

    @GetMapping
    public List<Feedback> findAll() {
        return dao.findAll();
    }

    @GetMapping("/user/{id_user}")
    public List<Feedback> findAllByUserId(@PathVariable int id_user) {
        return dao.findAllByUserId(id_user);
    }

    @GetMapping("/book/{id_book}")
    public List<Feedback> findAllByBookId(@PathVariable int id_book) {
        return dao.findAllByBookId(id_book);
    }

    @GetMapping("/{id}")
    public Optional<Feedback> findById(@PathVariable int id) {
        return dao.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Feedback create(@RequestBody Feedback feedback) {
        return dao.create(feedback);
    }

    @PutMapping("/{id}")
    public Feedback update(@RequestBody Feedback feedback, @PathVariable int id) {
        return dao.update(feedback, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        dao.delete(id);
    }

}
