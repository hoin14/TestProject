package com.test.junit;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {

    private List<Scoreable> scoreables = new ArrayList<>();

    public void add(Scoreable scoreable) {
        this.scoreables.add(scoreable);
    }

    public int getAverage() {
        int total = this.scoreables.stream().mapToInt(Scoreable::getScore).sum();
        return total / scoreables.size();
    }
}