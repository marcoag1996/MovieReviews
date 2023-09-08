package dev.aguilar.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// present each document of movie collection
// @Data avoid creating getters and setters
// @AllArgs, create the constructor
// @NoArg, create default constructor
@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    // this will be the key
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    // Manual relationship
    // Store id of reviews
    // reviews will be in other collections
    @DocumentReference
    private List<Review> reviewIds;
}
