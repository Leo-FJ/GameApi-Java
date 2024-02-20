package com.example.gameapi.Service;

import com.example.gameapi.Model.Data;
import com.example.gameapi.Model.Game;
import com.example.gameapi.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
     GameRepository gameRepository;

    public List<Game> getAllGames(){
        List<Game> games = new ArrayList<>();
        gameRepository.findAll().forEach(games::add);
        return games;
    }

    public Game getGameById(int id){
        return gameRepository.findById(id).get();
    }

    public void createGame(Game game){ gameRepository.save(game); }

    public void deleteGameById(int id){ gameRepository.deleteById(id); }

    public void updateGamebyId(int id, Game game){
        Game updategame = new Game();

        updategame.setName(game.getName());
        updategame.setCategory(game.getCategory());
        updategame.setId(id);

        gameRepository.save(updategame);
    }

}
