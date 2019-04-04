package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author ZhangShaowei on 2019/3/29 15:11
 **/
public class ContextStaticTest {

    public static void main(String[] args) throws Exception {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        System.out.println(123);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (StringUtils.hasText(str = reader.readLine())) {
            System.out.println(str);
        }
    }


}
