import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    App app = new App();
    @Test
    public void addMeTest(){
        assertEquals(12,app.addMe(11,1) );

    }
    @Test
    public void subMeTest(){
        assertEquals(12,app.subMe(13,1) );
    }

    @Test
    public void multiplyMeTest(){
        assertEquals(13,app.multiplyMe(13,1) );
    }
}
