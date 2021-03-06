package me.mholubczat.chucknorrisjokes.controller;


import org.springframework.ui.Model;

public interface JokeController {
    String sayJoke(Model model);
}
