package com.udacity.gradle.builditbigger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JokeFetchTest {

    private EndpointsAsyncTask task;

    @Before
    public void setup(){
        EndpointsAsyncTask.FetchJokeTaskListener listener = new EndpointsAsyncTask.FetchJokeTaskListener() {
            @Override
            public void onPreExecute() {
            }

            @Override
            public void onPostExecute(String fetchedJoke) {
                //Assert the fetchedJoke is not empty
                Assert.assertNotEquals(fetchedJoke, "");
            }
        };
        task = new EndpointsAsyncTask(listener);
    }

    @Test
    public void jokeNotEmptyTest(){
        task.execute();
    }

}
