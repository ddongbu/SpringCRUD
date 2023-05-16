package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inhatc.domain.BoardVO;
import com.inhatc.service.BoardService;

@Controller //깃발들어라
@RequestMapping("/board/*") //board디렉토리는 내가 담당할게  //localhost:8080/board/******
public class Boardcontroller {
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/register", method = RequestMethod.GET) //localhost:8080/board/register
	public String registerA(BoardVO board, Model model) throws Exception{ 
		System.out.println("Register (GET) Called"); //로그 찍기 
		return "/board/register2"; ///board/register.jsp불러오기 
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST) //localhost:8080/board/register
	public String registerPOST(BoardVO board, Model model) throws Exception{ 
		System.out.println("Register (POST) Called"); //로그 찍기 
		System.out.println("제목:  " + board.getTitle()); //로그 찍기 
		System.out.println("내용:  " + board.getContent()); //로그 찍기 
		System.out.println("글쓴이: " +  board.getWriter()); //로그 찍기 
		service.regist(board);
		return "home"; ///board/home.jsp불러오기 
	}
}