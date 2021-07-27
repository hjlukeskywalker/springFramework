package com.mvcboot.springboot.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mvcboot.springboot.model.mapper.MemberMapper;
import com.mvcboot.springboot.model.vo.Member;

@Repository
public class MemberDao {
	
	public List<Member> selectMemberAll(MemberMapper mapper){
		return mapper.selectMemberAll();
	}
	
	public Member selectOneMember(MemberMapper mapper, String userId) {
		return mapper.selectOneMember(userId);
	}
}
