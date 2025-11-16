import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitHubActionTestTest {

    static GitHubActionTest calc;

    @BeforeAll
    static void objectInit(){
        calc = new GitHubActionTest();
    }

    @Test
    void add() {
        assertEquals(5,calc.add(3, 2));
    }

    @Test
    void subt() {
        assertEquals(1,calc.subt(3, 2));

    }
}