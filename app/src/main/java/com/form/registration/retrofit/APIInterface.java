package com.form.registration.retrofit;



import com.form.registration.pojo.PersonalInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by anupamchugh on 09/01/17.
 */

public interface APIInterface {

   /* @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);*/

    @FormUrlEncoded
    @POST("/api/users?")
    Call<PersonalInfo> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}
