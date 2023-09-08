package dev.aguilar.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// class that interacts with database
@Service
public class MovieService {
    // let framework to instantiate for us
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    // this can return null thus optional
//    public Optional<Movie> singleMovie(ObjectId id) {
//        return movieRepository.findById(id);
//    }
    // using imdbid
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }


}
