package com.example.demo.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mvc.domain.Board;
import com.example.demo.mvc.repository.BoardRepository;

/**
 * 게시판 서비스
 * @author sungsin.ahn
 *
 */
@Service
public class BoardService {
	
	@Autowired(required=false)
	private BoardRepository repository;
	
	/**
	 * 목록 리턴
	 * @return
	 *
	 */
	public List<Board> getList(){
		return repository.getList();
	}
	
	/**
	 * 상세정보 리턴
	 * @param boardSeq
	 * @return
	 *
	 */
	public Board get(int boardSeq) {
		return repository.get(boardSeq);
	};
	
	/**
	 * 등록 처리.
	 * @param board
	 *
	 */
	public void save(Board board) {
		repository.save(board);
	}
	
	/**
	 * 업데이트 처리.
	 * @param board
	 *
	 */
	public void update(Board board) {
		repository.update(board);
	}
	
	/**
	 * 삭제처리
	 * @param boardSeq
	 *
	 */
	public void delete(int boardSeq) {
		repository.delete(boardSeq);
	}
}
