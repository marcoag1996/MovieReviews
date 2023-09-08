package dev.aguilar.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// let it know type of data and identifier
// let it know its a repository
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // create functions to find by keys
    Optional<Movie> findMovieByImdbId(String imdbId);
}
