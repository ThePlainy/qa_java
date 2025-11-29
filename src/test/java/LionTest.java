import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    Feline felineSpy;

    @Test
    public void lionGetBlankKittensTest() throws Exception {
        Lion lion = new Lion("Самец", felineSpy);
        int actualKittensNumber = lion.getKittens();
        assertThat(actualKittensNumber, is(1));
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        Lion lion = new Lion("Самец", felineSpy);
        List<String> actualLionFood = lion.getFood();
        assertThat(actualLionFood, is(List.of("Животные", "Птицы", "Рыба")));
    }

    @Test
    public void lionThrowsExceptionWithWrongSexTest() throws Exception{
        String actualException = null;
        try {
            Lion lion = new Lion("Самса", felineSpy);
        } catch (Exception e) {
            actualException = e.getMessage();
        } finally {
            assertThat(actualException,is("Используйте допустимые значения пола животного - самец или самка"));
        }
    }
}
