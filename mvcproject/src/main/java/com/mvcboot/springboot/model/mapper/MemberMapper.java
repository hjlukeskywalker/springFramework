package com.mvcboot.springboot.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mvcboot.springboot.model.vo.Member;

@Mapper
public interface MemberMapper {
	//메소드를 쿼리문으로 사용
	//@셀렉트, @업데이트,@델리트, @인서트
	
	@Select("SELECT*FROM MEMBER")
	public List<Member> selectMemberAll();
	
	@Select("SELECT * FROM MEMBER WHERE USERID =#{userId}")
	public Member selectOneMember(String userId);
}
