
package nba;

import java.util.Comparator;

public class BinarySearchComparator {
    Comparator<Players> c = new Comparator<Players>() {
        @Override
        public int compare(Players o1, Players o2) {
            return (o1.getName().compareTo(o2.getName()));
        }
    };

    Comparator<Players> d = new Comparator<Players>() {
        @Override
        public int compare(Players o1, Players o2) {
            return (o1.getJerseyNumber()-(o2.getJerseyNumber()));
        }
    };

    Comparator<Coaches> e = new Comparator<Coaches>() {
        @Override
        public int compare(Coaches o1, Coaches o2) {
            return (o1.name.compareTo(o2.name));
        }
    };
   }