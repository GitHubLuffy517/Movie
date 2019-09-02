package com.lxd.movie.service.impl;

import com.lxd.movie.bean.Poster;
import com.lxd.movie.dao.PosterDao;
import com.lxd.movie.dao.impl.PosterDaoImpl;
import com.lxd.movie.service.PosterService;

import java.util.List;

public class PosterServiceImpl implements PosterService {
	
	private PosterDao pd = new PosterDaoImpl();
	
	public void addPoster(Poster post) {
		pd.addPoster(post);
	}
	
	public void deletePoster(int PosterId) {
		pd.deletePoster(PosterId);
	}
	
	public List<Poster> selectPostAll() {
		return pd.selectAll();
	}

	@Override
	public void updatePoster(String PostDescription, int PosterId) {
		pd.updatePoster(PostDescription,PosterId);
	}
}
