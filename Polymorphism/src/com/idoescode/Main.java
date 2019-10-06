package com.idoescode;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }


    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Movie");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Earth";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable");
    }
}


public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Movie newMovie = randomMovie();
            System.out.println(newMovie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println(randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new ForgettableMovie();
        }

        return null;
    }
}
