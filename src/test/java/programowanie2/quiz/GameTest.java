package programowanie2.quiz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programowanie2.quiz.model.Question;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void start_should_display_welcome_message() {
        //given
        Question[] questions = {
                new Question(null, null, null, null)
        };

        //when
        game.start(questions);

        //then
        //sout("Witamy w grze");


    }


}