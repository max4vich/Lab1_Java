package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlateWriter {

    public void writeToFile(List<Plate> plates) {
        PrintWriter out = null;
        try {
            File csvFile = new File("Plate.csv");
            out = new PrintWriter(new FileWriter(csvFile));
            Map<Class<? extends Plate>, String> headersMap = new HashMap<>();
            for (Plate plate : plates) {
                Class<? extends Plate> plateClass = plate.getClass();
                String headers = headersMap.get(plateClass);
                if (headers == null) {
                    headers = plate.getHeaders();
                    headersMap.put(plateClass, headers);
                    out.println(headers);
                }
                out.println(plate.toCSV());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}