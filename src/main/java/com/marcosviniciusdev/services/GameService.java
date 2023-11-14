package com.marcosviniciusdev.services;

import com.marcosviniciusdev.dto.GameMinDTO;
import com.marcosviniciusdev.entities.Game;
import com.marcosviniciusdev.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

}
