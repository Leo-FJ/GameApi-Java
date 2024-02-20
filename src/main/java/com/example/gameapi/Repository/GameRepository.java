package com.example.gameapi.Repository;

import com.example.gameapi.Model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Integer> {

}
