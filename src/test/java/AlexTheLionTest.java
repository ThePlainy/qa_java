import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {

    AlexTheLion alexTheLion;

    @Spy
    Feline felineSpy;

    @Before
    public void startup() throws Exception {
        alexTheLion = new AlexTheLion(felineSpy);
    }

    @Test(expected = Exception.class)
    public void alexTheLionNoKittensTest() throws Exception {
        alexTheLion.getKittens();
    }

    @Test
    public void alexTheLionGetFoodTest() throws Exception {
        List<String> actualLionFood = alexTheLion.getFood();
        assertThat(actualLionFood, is(List.of("Животные", "Птицы", "Рыба")));
    }

    @Test
    public void alexTheLionHasTheGreatestMane() throws Exception {
        assertThat(alexTheLion.doesHaveMane(), is(true));
    }

    @Test
    public void alexTheLionGotFriendsTest() throws Exception {
        assertThat(alexTheLion.getFriends(), is(List.of("Марти", "Глория", "Мелман")));
    }

    @Test
    public void alexTheLionGotSomewhereToLive() throws Exception{
        assertThat(alexTheLion.getPlaceOfLiving(), is("Нью-Йоркский Зоопарк"));
    }
}
