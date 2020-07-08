package io.github.mokaim.mokaim_springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
        UserService userService = (UserService) ctx.getBean("userService");
        User user = userService.getUser("hero");
        System.out.println(user.getName());
        BoardService boardService = (BoardService) ctx.getBean("boardService");

        Board board = boardService.getBoard(1);
        
        System.out.println(board.getContent());
    }
}
