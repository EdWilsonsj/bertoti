package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
	private List<Game> games = new ArrayList<>();

	public GameController() {
		games.addAll(List.of(
				new Game("1","The Legend of Zelda"),
				new Game("2","Super Mario Bros"),
				new Game("3","Minecraft"),
				new Game("4","God of War")
		));
	}

	@GetMapping
	Iterable<Game> getGames() {
		return games;
	}

	@GetMapping("/{id}")
	Optional<Game> getGameById(@PathVariable String id) {
		for (Game g : games) {
			if (g.getId().equals(id)) {
				return Optional.of(g);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Game postGame(@RequestBody GameRequest request) {
		Game game = new Game(request.getName());
		games.add(game);
		return game;
	}

	@PutMapping("/{id}")
	ResponseEntity<Game> putGame(@PathVariable String id,
								 @RequestBody GameRequest request) {
		int gameIndex = -1;

		for (Game g : games) {
			if (g.getId().equals(id)) {
				gameIndex = games.indexOf(g);
				g.setName(request.getName());
				games.set(gameIndex, g);
			}
		}

		if (gameIndex == -1) {
			Game newGame = new Game(id, request.getName());
			games.add(newGame);
			return new ResponseEntity<>(newGame, HttpStatus.CREATED);
		}

		return new ResponseEntity<>(games.get(gameIndex), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteGame(@PathVariable String id) {
		games.removeIf(g -> g.getId().equals(id));
	}
}

class GameRequest {
	private String name;

	public GameRequest() {}

	public GameRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


class Game {
	private String id;
	private String name;


	public Game() {
	}

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

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
