package hu.unideb.inf.konyv;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        Map<String, ArrayList<Konyv>> jsonMap = om.readValue(new File("konyv.json"), new TypeReference<Map<String, ArrayList<Konyv>>>() {});
        ArrayList<Konyv> konyvArrayList = jsonMap.get("adatok");

        for (Konyv konyv : konyvArrayList) {
            System.out.println(konyv);
        }

        System.out.println("<500");
        konyvArrayList.stream().filter(e -> e.getOldalszam()<500).forEach(System.out::println);
        System.out.println("Avg isbn");
        System.out.println(konyvArrayList.stream().collect(Collectors.averagingDouble(Konyv::getISBN)));
        System.out.println("Map");
        Map<String, List<Konyv>> kiadoMap = konyvArrayList.stream().collect(Collectors.groupingBy(Konyv::getKiado));
        for (String key : kiadoMap.keySet()) {
            System.out.println(key + ": " + kiadoMap.get(key));
        }
    }
}
