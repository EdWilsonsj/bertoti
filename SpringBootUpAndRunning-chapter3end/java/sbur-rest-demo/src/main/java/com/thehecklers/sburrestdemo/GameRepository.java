package com.thehecklers.sburrestdemo;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GameRepository {
    private final JdbcTemplate jdbcTemplate;

    private static final RowMapper<Game> GAME_ROW_MAPPER = (rs, rowNum) ->
            new Game(rs.getString("id"), rs.getString("name"));

    public GameRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Game> findAll() {
        return jdbcTemplate.query("SELECT id, name FROM games ORDER BY name", GAME_ROW_MAPPER);
    }

    public Optional<Game> findById(String id) {
        try {
            Game game = jdbcTemplate.queryForObject(
                    "SELECT id, name FROM games WHERE id = ?",
                    GAME_ROW_MAPPER,
                    id
            );
            return Optional.ofNullable(game);
        } catch (EmptyResultDataAccessException ex) {
            return Optional.empty();
        }
    }

    public Game insert(Game game) {
        jdbcTemplate.update(
                "INSERT INTO games (id, name) VALUES (?, ?)",
                game.getId(),
                game.getName()
        );
        return game;
    }

    public int update(Game game) {
        return jdbcTemplate.update(
                "UPDATE games SET name = ? WHERE id = ?",
                game.getName(),
                game.getId()
        );
    }

    public int deleteById(String id) {
        return jdbcTemplate.update("DELETE FROM games WHERE id = ?", id);
    }
}
