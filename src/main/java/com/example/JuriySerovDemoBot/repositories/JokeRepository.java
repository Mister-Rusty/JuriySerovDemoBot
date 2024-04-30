package com.example.JuriySerovDemoBot.repositories;

import com.example.JuriySerovDemoBot.models.Joke;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeRepository extends JpaRepository<Joke, Integer> {

}