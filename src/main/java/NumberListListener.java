import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.List;
import java.util.Random;

@WebListener
public class NumberListListener implements ServletRequestListener, ServletContextListener {
    @Override
    public void requestInitialized(ServletRequestEvent sce) {
        List<Integer> numberList = (List<Integer>) sce.getServletContext().getAttribute("numberList");
        int newNumber = new Random().nextInt(100);
        System.out.println("New added number: " + newNumber);
        if (numberList == null) {
            System.out.println("number list initialized");
        } else {
            numberList.add(newNumber);
        }
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<Integer> numberList = (List<Integer>) sce.getServletContext().getAttribute("numberList");
        System.out.println("Number list when context initialized: " + numberList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        List<Integer> numberList = (List<Integer>) sce.getServletContext().getAttribute("numberList");
        System.out.println("Length of number list when context destroyed: " + numberList.size());
        System.out.println("Number list when context destroyed: " + numberList);
    }
}

