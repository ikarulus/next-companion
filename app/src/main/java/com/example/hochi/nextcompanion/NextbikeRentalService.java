package com.example.hochi.nextcompanion;

import retrofit2.Call;
import retrofit2.http.*;

/*
 * A Retrofit2 compatible Java Interface for the NextbikeRental-API on www.nextbike.net/api.
 * 
 **/

public interface NextbikeRentalService {

    @POST("login.json")
    public Call<NextbikeResponseLogin> login(@Body NextbikeRequestLoginObject login_object);
}
