import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actualFelineFood = feline.eatMeat();
        assertThat(actualFelineFood, is(List.of("Животные", "Птицы", "Рыба")));
    }

    @Test
    public void felineGetFamilyTest(){
        Feline feline = new Feline();
        String actualFelineFamily = feline.getFamily();
        assertThat(actualFelineFamily, is("Кошачьи"));
    }

    @Test
    public void felineGetBlankKittensTest(){
        Feline feline = new Feline();
        int actualKittensNumber = feline.getKittens();
        assertThat(actualKittensNumber, is(1));
    }

    @Test
    public void felineGetArgumentKittensTest(){
        Feline feline = new Feline();
        int kittensCount = 5;
        int actualKittensNumber = feline.getKittens(kittensCount);
        assertThat(actualKittensNumber, is(kittensCount));
    }

}
