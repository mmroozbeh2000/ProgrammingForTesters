package se.jocke.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import se.jocke.dependencyInjection.Fu;
import se.jocke.dependencyInjection.Ninja;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestNinja {
    @Mock
    Fu fu;

    @InjectMocks
    Ninja ninja = new Ninja();

    @Test
    public void testNinja() {
        when(fu.bar()).thenReturn("fu-bar");
        Assertions.assertEquals(fu.bar(), "fu-bar");
    }
}
