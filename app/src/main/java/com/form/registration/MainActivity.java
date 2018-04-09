package com.form.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.form.registration.pojo.PersonalInfo;
import com.form.registration.retrofit.APIClient;
import com.form.registration.retrofit.APIInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = APIClient.getClient().create(APIInterface.class);

        /**
         * POST name and job Url encoded.
         **/
        Call<PersonalInfo> call3 = apiInterface.doCreateUserWithField("morpheus", "leader");
        call3.enqueue(new Callback<PersonalInfo>()

        {
            @Override
            public void onResponse (Call < PersonalInfo > call, Response< PersonalInfo > response){


            }

            @Override
            public void onFailure (Call < PersonalInfo > call, Throwable t){
                call.cancel();
            }
        });

    }




}
