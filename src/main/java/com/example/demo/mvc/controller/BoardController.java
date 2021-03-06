package com.example.demo.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mvc.domain.Board;
import com.example.demo.mvc.service.BoardService;

/**
 * 게시판 컨트롤러
 * @author sungsin.ahn
 *
 */
@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/**
	 * 목록 리턴
	 * @return
	 *
	 */
	@GetMapping
	public List<Board> getList(){
		return boardService.getList();
	}
	
	/**
	 * 상세정보 리턴
	 * @param boardSeq
	 * @return
	 *
	 */
	@GetMapping("/{boardSeq}")
	public Board get(@PathVariable int boardSeq) {
		return boardService.get(boardSeq);
	};
	
	/**
	 * 등록/수정 처리.
	 * @param board
	 *
	 */
	@GetMapping("/save")
	void save(Board board) {
		boardService.save(board);
	}
	
	/**
	 * 업데이트 처리.
	 * @param board
	 *
	 */
	@GetMapping("/delete/{boardSeq}")
	void update(Board board) {
		boardService.update(board);
	}
	
	/**
	 * 삭제처리
	 * @param boardSeq
	 *
	 */
	void delete(int boardSeq) {
		boardService.delete(boardSeq);
	}
}
