package me.mholubczat.chucknorrisjokes.controller;

import me.mholubczat.chucknorrisjokes.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeControllerImpl implements JokeController {

    private final JokeService jokeService;

    public JokeControllerImpl(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @Override
    @GetMapping("/")
    public String sayJoke() {
        return jokeService.getJoke();
    }
}
