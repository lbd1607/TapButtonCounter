package com.missouristate.davis916.tapbuttoncounter;

/**
 * Created by Laura on 1/31/2018.
 */

public class Counter {
    private int mCount;

    //initializes mCount to zero
    public Counter(){
        mCount = 0;
    }

    //increments the mCount with each tap of the TAP button
    public void addCount(){
        mCount++;
    }

    //returns the incremented mCount value
    public Integer getCount(){
        return mCount;
    }

    //resets the mCount when the RESET button is tapped
    public void reset() { mCount = 0; }

}//end of Counter
