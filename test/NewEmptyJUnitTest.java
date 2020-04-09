
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewEmptyJUnitTest {

@Test
   
public void testMain(){
            System.out.println("main");
            int a = 1;
            int b =  -2;
            int c = 1;
            int expResult = 0;
            int result = MyMath.main(a, b, c);
            assertEquals(expResult, result);
}
    private static class MyMath {

        private static int main(int a, int b, int c) {
            return 0;
        }
        public MyMath() {
        }
    }
}

    

