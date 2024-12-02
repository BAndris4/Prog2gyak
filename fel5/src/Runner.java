import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Auto> autoArrayList = new ArrayList<>();
        autoArrayList.add(new Auto("ABC123", "Mercedes", "AMG", "2015"));
        autoArrayList.add(new Auto("DFG541", "Audi", "A4", "2010"));
        autoArrayList.add(new Auto("KLM563", "Audi", "A5", "2013"));
        autoArrayList.add(new Auto("ASD412", "Mercedes", "CLA", "2006"));
        autoArrayList.add(new Auto("FEF512", "Volkswagen", "Golf", "2016"));
        autoArrayList.add(new Auto("KMH992", "Audi", "A7", "2015"));
        autoArrayList.add(new Auto("LLO231", "Volkswagen", "Golf", "2017"));
        autoArrayList.add(new Auto("PTQ161", "BMW", "x1", "2004"));
        autoArrayList.add(new Auto("MAW521", "Audi", "A5", "2012"));
        autoArrayList.add(new Auto("ABC123", "BMW", "x4", "2009"));

        TreeMap<Autotipus, ArrayList<Auto>> autoTreeMap = new TreeMap<>(new Comparator<Autotipus>() {
            @Override
            public int compare(Autotipus o1, Autotipus o2) {
                int v = o1.getMarka().compareTo(o2.getMarka());
                if (v!=0) return v;
                return o1.getTipus().compareTo(o2.getTipus());
            }
        });
        for (Auto auto : autoArrayList) {
            List<Auto> list = autoArrayList.stream().filter(e -> e.getMarka().equals(auto.getMarka()) && e.getTipus().equals(auto.getTipus())).toList();
            ArrayList<Auto> autoList = new ArrayList<>(list);
            autoTreeMap.put(new Autotipus(auto.getMarka(), auto.getTipus()), autoList);
        }

        for (Autotipus autotipus : autoTreeMap.keySet()) {
            System.out.println(autotipus + ": " + autoTreeMap.get(autotipus));
        }
    }
}
