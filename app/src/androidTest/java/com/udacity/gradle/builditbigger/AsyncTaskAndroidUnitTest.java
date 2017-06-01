package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by harry on 5/28/17.
 */
@RunWith(AndroidJUnit4.class)
public class AsyncTaskAndroidUnitTest {
    @Rule
    public ActivityTestRule<MainActivity> rule  = new  ActivityTestRule<>(MainActivity.class);
    @Test
    public void AsycTaskTestMethod() throws Throwable {
        MainActivity activity = rule.getActivity();
        MainActivity.EndpointsAsyncTask asyncTask =  activity.new EndpointsAsyncTask();
        asyncTask.execute(activity);
    }
}
