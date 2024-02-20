package com.example.gameapi.Controller;

import com.example.gameapi.Model.Data;
import com.example.gameapi.Model.Game;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GetAllGames {
    //find all
    @GetMapping
    public List<Game> GetAllGames() {
        return Data.games;
    }

    //create/post
    @PostMapping
    void createGame(@RequestBody Game game) {
        Data.games.add(game);
    }

    //find by id
    @GetMapping("/{id}")
    Game getGameById(@PathVariable int id) {
        return Data.games.stream()
                .filter(game -> id == game.getId())
                .findAny().orElse(null);
    }

    //Delete by id
    @DeleteMapping("/{id}")
    boolean deleteGamebyId(@PathVariable int id) {
        Game gamefound = Data.games.stream()
                .filter(game -> id == game.getId())
                .findAny().orElse(null);
        if (gamefound != null) {
            Data.games.remove(gamefound);
            return true;
        }
        return false;
    }

    //update/put
    @PutMapping("{id}")
    boolean putGamebyId(@PathVariable int id,@RequestBody Game game) {
        Game updategame = new Game();

        updategame.setName(game.getName());
        updategame.setCategory(game.getCategory());
        updategame.setId(id);

        if (updategame != null){
            Data.games.set(updategame.getId(), updategame);
            return true;
        }
        return false;
    }
}