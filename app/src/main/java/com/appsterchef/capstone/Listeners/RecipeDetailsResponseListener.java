package com.appsterchef.capstone.Listeners;

import com.appsterchef.capstone.Models.RecipeDetailsResponse;

public interface RecipeDetailsResponseListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
