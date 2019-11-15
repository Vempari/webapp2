package webapp;

import javax.ejb.Stateless;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class EJBLogic {
    public String doRecursion(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        searchFiles(file, list);
        String result = "";
        for (String str : list) {
            result = result + "<p>" + str + "</p>";
        }
        return result;


    }


    public void searchFiles(File root, List<String> list) {
        if(root == null || list == null) return;
        if(root.isDirectory()) {
            for(File file : root.listFiles()) {
                searchFiles(file, list);
            }
        }
        list.add(root.toString());
    }

}
