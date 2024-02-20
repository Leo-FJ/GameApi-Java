package com.example.gameapi.Controller;

import com.example.gameapi.Model.Data;
import com.example.gameapi.Model.Game;
import com.example.gameapi.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/games")
public class GetAllGames {
    @Autowired
    GameService gameService;

    //find all
    @GetMapping
    public List<Game> GetAllGames() { return gameService.getAllGames(); }

    //find by id
    @GetMapping("/{id}")
    Game getGameById(@PathVariable int id) { return gameService.getGameById(id); }

    //create/post
    @PostMapping
    void createGame(@RequestBody Game game) { gameService.createGame(game); }

    //Delete by id
    @DeleteMapping("/{id}")
    void deleteGamebyId(@PathVariable int id) { gameService.deleteGameById(id); }

    //update/put
    @PutMapping("{id}")
    void putGamebyId(@PathVariable int id, @RequestBody Game game) { gameService.updateGamebyId(id, game); }
}