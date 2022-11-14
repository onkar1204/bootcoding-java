package com.bootcoding.assignment;

public class StudentMarks {

    String Name;
    int physics;
    int chemestory;
    int math;
    int history;

    double avrageMark;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemestory() {
        return chemestory;
    }

    public void setChemestory(int chemestory) {
        this.chemestory = chemestory;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public double getAvrageMark() {
        return avrageMark;
    }

    public void setAvrageMark(double avrageMark) {
        this.avrageMark = avrageMark;
    }

    public double getPercentageMarks() {
        return percentageMarks;
    }

    public void setPercentageMarks(double percentageMarks) {
        this.percentageMarks = percentageMarks;
    }

    double percentageMarks;


}
