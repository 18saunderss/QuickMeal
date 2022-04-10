package com.appsterchef.capstone.Listeners;

import com.appsterchef.capstone.Models.RandomRecipe;

import java.util.List;

public interface RandomAPIResponseListener {
    void didFetch(List<RandomRecipe> responses, String message);
    void didError(String message);
}
