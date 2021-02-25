package se.jocke.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFruit {
    @Test
    public void testCreateApple() {
        Fruit f = Apple.builder().name("Granny Smith").build();
        Assertions.assertAll("Apple",
                () -> assertNotNull(f),
                () -> assertTrue(f.isEatable()),
                () -> assertEquals("Granny Smith", f.getName())
        );
    }
    @Test
    public void testCreateBapelsin() {
        Fruit f = Bappelsin.builder().name("Bapel").build();
        Assertions.assertAll("Bapel",
                () -> assertNotNull(f),
                () -> assertFalse(f.isEatable()),
                () -> assertEquals("Bapel", f.getName())
        );
    }
}
