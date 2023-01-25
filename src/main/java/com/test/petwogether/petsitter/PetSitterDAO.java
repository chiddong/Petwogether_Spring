package com.test.petwogether.petsitter;

import java.util.List;

import com.test.petwogether.PetDTO;

public interface PetSitterDAO {

	List<PetSitterDTO> pslist();


	PetSitterDTO pLoginCheck(PetSitterDTO dto);

	//지현 부분 START
	PetSitterDTO psinfo(String psseq);

	RegisterDTO rget(String psseq);

	List<PetDTO> pspet(String psseq);

	List<RDateDTO> rdlist(String psseq);

	//지현 부분 END
}
