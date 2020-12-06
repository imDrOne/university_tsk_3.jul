package ru.miit;

import ru.miit.annotations.Added;
import ru.miit.annotations.Deleted;

import javax.enterprise.event.Observes;
import java.util.ArrayList;

public class NumService {
    public void calculateAvg(@Observes @Added ArrayList<Integer> arrayList) {
        Integer[] array = arrayList.toArray(new Integer[0]);

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Simple avg:\n" + sum);
    }

    public void geometricMean(@Observes @Deleted ArrayList<Integer> arrayList ) {
        Integer[] array = arrayList.toArray(new Integer[0]);

        double sum = 0;
        int n = array.length;

        for (int j : array) sum = sum + Math.log(j);

        sum = sum / n;

        System.out.println("Geometric avg:");
        System.out.println(Math.exp(sum));
    }
}
