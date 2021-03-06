package academy.learnprogramming.console;

import academy.learnprogramming.cofig.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    //private static final Logger log = LoggerFactory.getLogger(Main.class);

    //private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create the context
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(GameConfig.class);

        // get number generator bean from context/container
//        NumberGenerator numberGenerator
//                = context.getBean(NumberGenerator.class);

        // call method next() to get a random number
//        int number = numberGenerator.next();
//        log.info("number = {}", number);    //parameterized loggin

        // get the messageGenerator and game bean from context (container)
        //Game game = context.getBean(Game.class);
//        MessageGenerator messageGenerator =
//                context.getBean(MessageGenerator.class);
//        log.info("getMainMessage= {}", messageGenerator.getMainMessage());
//        log.info("getResultMessage= {}", messageGenerator.getResultMessage());


        // call reset method
        //game.reset();

        //close  context (container)
        context.close();
    }


}







