package com.lxd.movie.service;

import com.lxd.movie.bean.Poster;

import java.util.List;

public interface PosterService {
    void addPoster(Poster post);
    void deletePoster(int PosterId);
    void updatePoster(String PostDescription,int PosterId);
    List<Poster> selectPostAll();
}
