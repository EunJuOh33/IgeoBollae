package org.moviebollae.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.moviebollae.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {org.moviebollae.config.RootConfig.class} )
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
//	@Test
//	public void testInsert() {
//	
//		BoardVO board = new BoardVO();
//		
//		board.setTitle("테스트 - 새로 작성하는 글");
//		board.setContent("테스트 - 새로 작성하는 내용");
//		board.setWriter("TESTnewbie");
//		
//		mapper.insert(board);
//		
//		log.info(board);	// BoardVO의 toString() 결과 출력
//							// bno = null 로 비어있게 된다.
//	}
	
	@Test
	public void testInsertSelectKey() {
	
		BoardVO board = new BoardVO();
		
		board.setTitle("테스트 - 새로 작성하는 글 selectKey");
		board.setContent("테스트 - 새로 작성하는 내용 selectKey");
		board.setWriter("TESTnewbie");
		
		mapper.insertSelectKey(board);
		
		log.info(board);	// bno = 7 
	}
	
}
