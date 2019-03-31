package com.eemf.sirgoingfar.jokesource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeSource {

    private static JokeSource sInstance;
    private List<String> mJokesList;

    public static JokeSource getsInstance() {
        sInstance = new JokeSource();
        return sInstance;
    }

    private JokeSource() {
        if (sInstance == null)
            sInstance = this;

        seedJokes();
    }

    private void seedJokes() {
        if(mJokesList == null)
            mJokesList = new ArrayList<>();

        mJokesList.add("Today at the bank, an old lady asked me to help check her balance. So I pushed her over.");
        mJokesList.add("I bought some shoes from a drug dealer. I don't know what he laced them with, but I've been tripping all day.");
        mJokesList.add("I told my girlfriend she drew her eyebrows too high. She seemed surprised.");
        mJokesList.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
        mJokesList.add("I'm so good at sleeping. I can do it with my eyes closed.");
        mJokesList.add("My boss told me to have a good day.. so I went home.");
        mJokesList.add("Why is Peter Pan always flying? He neverlands.");
        mJokesList.add("A woman walks into a library and asked if they had any books about paranoia. The librarian says \"They're right behind you!\"");
        mJokesList.add("The other day, my wife asked me to pass her lipstick but I accidentally passed her a glue stick. She still isn't talking to me.");
        mJokesList.add("Why do blind people hate skydiving? It scares the hell out of their dogs.");
    }

    private String getJoke() {

        int availableJokesNum = mJokesList.size();
        String no_joke = "Our joke factory is down :)";

        Random rand = new Random();
        int index = rand.nextInt(availableJokesNum);

        if(mJokesList.size() == 0 || index > (availableJokesNum - 1) || index < 0)
            return no_joke;

        return mJokesList.get(index);
    }

    public String tellAJoke() {
        return getJoke();
    }
}
