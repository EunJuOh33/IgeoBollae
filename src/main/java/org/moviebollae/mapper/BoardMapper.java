package org.moviebollae.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.moviebollae.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();	// 게시글 전체 조회

}
