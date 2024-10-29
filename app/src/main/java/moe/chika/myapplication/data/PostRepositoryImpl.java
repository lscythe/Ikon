package moe.chika.myapplication.data;

import java.util.List;

import javax.inject.Inject;

import moe.chika.myapplication.domain.PostRepository;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PostRepositoryImpl implements PostRepository {

    @Inject
    JsonService jsonService;

    @Override
    public List<PostResponse> getResponse() {
        try {
            return jsonService.getPost().body();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
