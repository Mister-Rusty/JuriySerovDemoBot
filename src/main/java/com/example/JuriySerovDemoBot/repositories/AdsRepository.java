package com.example.JuriySerovDemoBot.repositories;

import com.example.JuriySerovDemoBot.models.Ads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsRepository extends JpaRepository<Ads, Long> {
}
