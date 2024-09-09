package com.studies.poc.record_pattern.service;

import com.studies.poc.record_pattern.data.*;
import org.springframework.stereotype.Service;


@Service
public class LanguageService {

    public String getTranslatedText(User user) {
        return switch (user) {
            case User(_, _, Portuguese _) -> "Esta PoC foi feito para se divertir com alguns recursos do java 21.";
            case User(_, _, English _) -> "This PoC was made to have fun with some java 21 features.";
            case User(_, _, German _) -> "Dieser PoC wurde zum Spaß mit einigen Java 21-Funktionen erstellt.";
            case User(_, _, Chinese _)  -> "这个 PoC 的目的是为了享受一些 java 21 功能的乐趣。";
            case User(_, _, French _) -> "Ce PoC a été conçu pour s'amuser avec certaines fonctionnalités de Java 21.";
            default -> "?";
        };
    }
}
