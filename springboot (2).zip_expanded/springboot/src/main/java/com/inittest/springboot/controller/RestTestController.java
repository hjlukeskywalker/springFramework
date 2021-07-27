package com.inittest.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inittest.springboot.model.vo.Member;

@RestController	
public class RestTestController {

	//REST-api로 설계
	//요청주소를 URI를 보고 판단할 수 있게 설계하고
	//단위 서비스로 구현하여 모듈단위로 이용할 수 있게 하는것
	//localhost:9090/selectMemberAll
	//localhost:9090/members Method로 지정을 하자
	//Method로 uri 주소가 하는 행위를 지정 URI설계시에는 그행위에 대한 내용은 빼자
	//GET: 조회 (SELECT)
	//POST: 입력(CREATE)
	//PUT: 수정(UPDATE)
	//DELETE: 삭제(DELETE)
	
	//GET::localhost:9090/member/admin -> 회원중 admin을 조회
	//GET::localhost:9090/board/1 -> 1번 게시물 조회
	//POST::localhost:9090/member -> 회원등록 requestBody에 있는 값을 저장
	//PUT::localhost:9090/member/admin
	
	//서버는 데이터만 전송 ->JSON
	
	private List<Member> list=List.of(
			Member.builder().userId("낙타").age(19).email("aaa@aaa").build(),
			Member.builder().userId("호랑이").age(29).email("aaa@aaa").build(),
			Member.builder().userId("사자").age(19).email("aaa@aaa").build(),
			Member.builder().userId("늑대").age(19).email("aaa@aaa").build()
			);
	
	@GetMapping("/members")
	public List<Member> selectAllMember(){
		return list;
	}
	

}
