package webapp;

import javax.ejb.Stateless;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class EJBLogic {
    public List<String> doRecursion() {
        File file = new File("src");
        List<String> list = new ArrayList<>();
        searchForDatFiles(file, list);
        return list;
    }


    public void searchForDatFiles(File root, List<String> list) {
        if(root == null || list == null) return;
        if(root.isDirectory()) {
            for(File file : root.listFiles()) {
                searchForDatFiles(file, list);
            }
        }
        list.add(root.toString());
    }

}
