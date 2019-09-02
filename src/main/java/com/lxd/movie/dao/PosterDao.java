package com.lxd.movie.dao;

import com.lxd.movie.bean.Poster;
import java.util.List;

public interface PosterDao {
    void addPoster(Poster Poster);
    void deletePoster(int PosterId);
    void updatePoster(String PostDescription,int PosterId);
    List<Poster> selectAll();
}
