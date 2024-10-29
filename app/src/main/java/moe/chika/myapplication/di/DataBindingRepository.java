package moe.chika.myapplication.di;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import moe.chika.myapplication.data.PostRepositoryImpl;
import moe.chika.myapplication.domain.PostRepository;

@Module
@InstallIn(SingletonComponent.class)
public class DataBindingRepository {
    @Binds
    PostRepository getPostRepository() {
        return new PostRepositoryImpl();
    }
}
