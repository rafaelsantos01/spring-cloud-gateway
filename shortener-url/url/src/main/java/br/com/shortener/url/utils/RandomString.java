package br.com.shortener.url.utils;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomString {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int STRING_LENGTH = 5;
    private static final Random RANDOM = new Random();

    public String generateRandomString() {
        StringBuilder builder = new StringBuilder(STRING_LENGTH);

        for (int i = 0; i < STRING_LENGTH; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            builder.append(CHARACTERS.charAt(index));
        }

        return builder.toString();
    }
}
