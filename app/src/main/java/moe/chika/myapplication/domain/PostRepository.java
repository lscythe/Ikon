package moe.chika.myapplication.domain;

import java.util.List;

import moe.chika.myapplication.data.PostResponse;
import retrofit2.Response;

public interface PostRepository {
    List<PostResponse> getResponse();
}
