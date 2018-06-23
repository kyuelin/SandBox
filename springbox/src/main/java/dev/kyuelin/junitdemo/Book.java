package dev.kyuelin.junitdemo;

public class Book {

    public String getName() {
        return name;
    }

    private String name;

    public Book(String name) {
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        return name.equalsIgnoreCase(((Book)obj).getName());
    }
}
