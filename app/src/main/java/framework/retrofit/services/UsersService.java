package framework.retrofit.services;


import java.util.List;

import framework.model.jsonplaceholder.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface UsersService {

    @GET("/users")
    Call<List<User>> getUsers();

}
