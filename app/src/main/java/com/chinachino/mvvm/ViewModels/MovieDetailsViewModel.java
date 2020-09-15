package com.chinachino.mvvm.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.chinachino.mvvm.Repositories.MovieDetailsRepository;
import com.chinachino.mvvm.models.Details;

public class MovieDetailsViewModel extends ViewModel {
    public boolean isMovieRetrieved() {
        return isMovieRetrieved;
    }

    public void setMovieRetrieved(boolean movieRetrieved) {
        isMovieRetrieved = movieRetrieved;
    }

    private boolean isMovieRetrieved = false;
    private MovieDetailsRepository movieRepository;

    public MovieDetailsViewModel() {
        movieRepository = MovieDetailsRepository.getInstance();
    }
    public LiveData<Details> getMovieDetails(){
        return movieRepository.getMovieDetails();
    }
    public void SearchMovieDetails(int movieID){
        movieRepository.SearchMovieDetails(movieID);
    }
    public LiveData<Boolean> isRequestTimedOut(){
        return movieRepository.isRequestTimeOut();
    }
}
