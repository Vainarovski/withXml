package logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 22.09.2017.
 */
public class Start {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        WordCreator wordCreator = (WordCreator) context.getBean("word");

        System.out.println(wordCreator.createWord());

    }
}
