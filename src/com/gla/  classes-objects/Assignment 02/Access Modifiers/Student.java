package com.gla.methods;

class Student {

    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {

    void display() {
        System.out.println(rollNumber + " " + name);
    }
}

class TestStudent {
    public static void main(String[] args) {

        PostgraduateStudent s = new PostgraduateStudent();

        s.rollNumber = 1;
        s.name = "Rahul";
        s.setCGPA(8.5);

        s.display();
        System.out.println(s.getCGPA());
    }
}
