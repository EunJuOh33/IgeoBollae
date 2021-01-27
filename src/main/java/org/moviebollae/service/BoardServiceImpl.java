package org.moviebollae.service;

import java.util.List;

import org.moviebollae.domain.BoardVO;
import org.moviebollae.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	// spring 4.3 이상에서 자동 처리
	private BoardMapper mapper;

	
	/* 게시글 등록 */
	@Override
	public void register(BoardVO board) {
		
		log.info("register......" + board);
		
		mapper.insertSelectKey(board);
	}

	/* 글 번호(bno)로 게시글 하나 조회 */
	@Override
	public BoardVO get(Long bno) {

		log.info("get......");
		
		return mapper.read(bno);
	}

	/* 게시글 수정 
	 * 결과가 1이라면 true, 아니라면 false 반환 */
	@Override
	public boolean modify(BoardVO board) {
		
		log.info("update......");
		
		return mapper.update(board) == 1;
	}

	/* 게시글 삭제
	 * 결과가 1이라면 true, 아니라면 false 반환 */
	@Override
	public boolean remove(Long bno) {
		
		log.info("remove......");
		
		return mapper.delete(bno) == 1;
	}

	/* 모든 게시글 조회 */
	@Override
	public List<BoardVO> getList() {
		
		log.info("getList......");
		
		return mapper.getList();
	}
	
}
