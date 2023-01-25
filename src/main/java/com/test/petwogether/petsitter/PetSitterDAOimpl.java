package com.test.petwogether.petsitter;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.test.petwogether.PetDTO;

@Repository
@Primary
public class PetSitterDAOimpl implements PetSitterDAO {

	@Autowired
	private SqlSessionTemplate sql;

	@Override
	public PetSitterDTO pLoginCheck(PetSitterDTO dto) {

		return this.sql.selectOne("petsitter.auth", dto);
	}

	// 지현 부분 START

	@Override
	public List<PetSitterDTO> pslist() {

		return sql.selectList("petsitter.list");
	}

	@Override
	public PetSitterDTO psinfo(String psseq) {

		return sql.selectOne("petsitter.info", psseq);
	}

	@Override
	public RegisterDTO rget(String psseq) {
		
		return sql.selectOne("petsitter.rinfo", psseq);
	}

	@Override
	public List<PetDTO> pspet(String psseq) {

		return sql.selectList("petsitter.pspet", psseq);
	}
	
	@Override
	public List<RDateDTO> rdlist(String psseq) {

		return sql.selectList("petsitter.rdlist", psseq);
	}
	
	// 지현 부분 END

}
