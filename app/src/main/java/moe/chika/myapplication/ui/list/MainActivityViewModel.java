package moe.chika.myapplication.ui.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import moe.chika.myapplication.data.PostResponse;
import moe.chika.myapplication.domain.PostRepository;

@HiltViewModel
public class MainActivityViewModel extends ViewModel {

    @Inject
    private PostRepository repository;

    private MutableLiveData<List<PostResponse>> mutablePosts = null;

    public LiveData<List<PostResponse>> posts = mutablePosts;


    public void getPost() {
        mutablePosts.postValue(repository.getResponse());
    }
}
