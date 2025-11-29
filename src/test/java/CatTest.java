import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Spy
    Feline felineSpy;
    @Mock
    Feline feline;

    @Test
    public void catGetSoundTest() {
        Cat cat = new Cat(feline);
        String actualCatSound = cat.getSound();
        assertThat(actualCatSound, is("Мяу"));
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Cat cat = new Cat(felineSpy);
        List<String> actualCatFood = cat.getFood();
        assertThat(actualCatFood, is(List.of("Животные", "Птицы", "Рыба")));
    }
}
