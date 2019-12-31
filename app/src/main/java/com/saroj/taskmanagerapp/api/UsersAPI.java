package com.saroj.taskmanagerapp.api;

import com.saroj.taskmanagerapp.model.Users;
import com.saroj.taskmanagerapp.serverresponse.ImageResponse;
import com.saroj.taskmanagerapp.serverresponse.SignUpResponse;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface UsersAPI {
    @POST("users/signup")
    Call<SignUpResponse>  registerUser(@Body Users users);


    @POST("users/login")
    Call<SignUpResponse> checkUser(@Field("username") String username, @Field("password") String password);

    @Multipart
    @POST("upload")
    Call<ImageResponse>  uploadImage(@Part MultipartBody.Part img);

}
