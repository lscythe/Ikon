package moe.chika.myapplication.data;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.GET;

public interface JsonService {
    @GET
    Response<List<PostResponse>> getPost();
}
