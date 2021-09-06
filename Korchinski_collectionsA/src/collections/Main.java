package collections;

import collections.service.AmperageOperation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {

        List<Double> U = new ArrayList<>();

        List<Double> I = new ArrayList<>();


        U.add(0.9);

        U.add( 2.2);

        U.add( 3.1);

        U.add( 3.8);

        I.add( 2.3);

        I.add( 3.7);

        I.add( 6.3);

        I.add( 7.9);

        double R = AmperageOperation.s(U, I)/AmperageOperation.skv(I);

        System.out.println(R);

    }
}
