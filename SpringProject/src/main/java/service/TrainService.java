package service;

import org.springframework.beans.factory.annotation.Autowired;

import Model.MemberDAO;
import Model.MemberDTO;

public class TrainService {
	
	@Autowired
	MemberDAO memberDao;
	MemberDTO memberDto;
	
	
}
