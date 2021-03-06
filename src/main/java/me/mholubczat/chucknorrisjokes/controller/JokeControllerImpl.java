package me.mholubczat.chucknorrisjokes.controller;

import me.mholubczat.chucknorrisjokes.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeControllerImpl implements JokeController {

    private final JokeService jokeService;

    public JokeControllerImpl(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @Override
    @RequestMapping ({"/",""})
    public String sayJoke(Model model) {
        model.addAttribute("joke",jokeService.getJoke());

        return "index";
    }
}
