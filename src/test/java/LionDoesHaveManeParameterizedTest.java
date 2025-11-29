import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionDoesHaveManeParameterizedTest {

    private final String sex;
    private final Boolean expectedMane;

    public LionDoesHaveManeParameterizedTest(String sex, Boolean expectedMane){
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object [][] getLionData(){
        return new Object[][]{
                {"Самец",true},
                {"Самка",false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void lionHasManeTest() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        assertThat(lion.doesHaveMane(), is(expectedMane));
    }

}
