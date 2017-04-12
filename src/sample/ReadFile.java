package sample;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MartynasV on 2017-04-12.
 */
public class ReadFile {
    public static Map<String,String> readFile() {
            Map<String, String> paieska = new HashMap<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("zodynas.txt")));
            String line = null;
            while ((line = bf.readLine()) != null) {
                String[]mas= line.split("-"); // splitas, kad suprastu "-"
                if (mas.length==2){
                    paieska.put(mas[0], mas[1]);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return paieska;

    }
}

