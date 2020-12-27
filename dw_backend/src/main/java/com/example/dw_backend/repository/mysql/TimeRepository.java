package com.example.dw_backend.repository.mysql;

import com.example.dw_backend.model.mysql.Time;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuedixuedi
 */
@Repository
public interface TimeRepository extends CrudRepository<Time, Long> {

    @Query(value = "call find_movie_after_year(:year, :big);", nativeQuery = true)
    List<Integer> getMovieCount(@Param("year") int year, @Param("big") boolean big);

}
