package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/games")
class GameController {
    private final GameRepository repository;

    public GameController(GameRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    Iterable<Game> getGames() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Game> getGameById(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping
    Game postGame(@RequestBody GameRequest request) {
        Game toInsert = new Game(request.getName());
        return repository.insert(toInsert);
    }

    @PutMapping("/{id}")
    ResponseEntity<Game> putGame(@PathVariable String id,
                                 @RequestBody GameRequest request) {
        Game updated = new Game(id, request.getName());
        int rows = repository.update(updated);
        if (rows == 0) {
            repository.insert(updated);
            return new ResponseEntity<>(updated, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteGame(@PathVariable String id) {
        repository.deleteById(id);
    }
}


class Game {
    private final String id;
    private String name;

    public Game(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Game(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
