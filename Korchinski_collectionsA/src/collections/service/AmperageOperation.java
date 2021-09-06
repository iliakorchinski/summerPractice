package collections.service;

import java.util.List;

public class AmperageOperation {

    public static double s(List<Double>  l1, List<Double>  l2) {

        double r = 0;

        for(int i = 0; i< l1.size(); i++) {

            r += l1.get(i)*l2.get(i);

        }
        return r;
    }

    public static double skv(List<Double> l) {

        double r = 0;

        for(double d : l) {

            r += d*d;

        }

        return r;

    }
}
