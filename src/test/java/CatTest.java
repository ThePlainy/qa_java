import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Cat cat;

    @Mock
    Feline feline;

    @Before
    public void startup() {
        cat = new Cat(feline);
    }

    @Test
    public void catGetSoundTest() {
        String actualCatSound = cat.getSound();
        assertThat(actualCatSound, is("Мяу"));
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualCatFood = cat.getFood();
        assertThat(actualCatFood, is(List.of("Животные", "Птицы", "Рыба")));
    }
}
