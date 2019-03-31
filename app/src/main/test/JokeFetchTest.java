package com.eemf.sirgoingfar.a4410_exercise_solution_setupunittesting;

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
                Assert.assertNotEquals(fetcshedJoke, "");
            }
        };
        task = new EndpointsAsyncTask(listener);
    }

    @Test
    public void jokeNotEmptyTest(){
        task.execute();
    }

}
