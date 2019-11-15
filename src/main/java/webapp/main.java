package webapp;

import java.io.IOException;

public class main {
    public static void main(String[] args)  {
        EJBLogic logic = new EJBLogic();
        System.out.println(logic.doRecursion());
    }
}
