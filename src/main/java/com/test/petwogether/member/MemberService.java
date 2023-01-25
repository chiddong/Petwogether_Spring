package com.test.petwogether.member;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import com.test.petwogether.PetDTO;
import com.test.petwogether.admin.AdminDTO;
import com.test.petwogether.petsitter.PetSitterDTO;
import com.test.petwogether.petsitter.RDateDTO;
import com.test.petwogether.petsitter.RegisterDTO;

public interface MemberService {

	MemberDTO mLoginCheck(String id, String pass);

	PetSitterDTO fLoginCheck(String id, String pass);

	AdminDTO aLoginCheck(String id, String pass);

	// 지현 부분 START
	List<PetSitterDTO> pslist();

	PetSitterDTO psinfo(String psseq);

	RegisterDTO rget(String psseq);

	List<PetDTO> pspetlist(String psseq);

	List<RDateDTO> rdlist(String psseq);

	List<PetDTO> mpetlist(String mseq);

	int setcareservice(CareServiceDTO csdto);

	int getmaxcsseq();

	int setrdate(RDateDTO rddto);

	// 지현 부분 END

	// 동균 부분 START
	List<PSReviewDTO> getPSReviewList();

	String getMemberId(String mseq);

	PSReviewDTO getPSReview(String psrseq);

	CareServiceDTO getRService(String psrseq);

	PetSitterDTO getRPetSiiter(String psrseq);

	int addPSReview(PSReviewDTO dto);

	List<CareServiceDTO> getCSSeq(String attribute);

	int editPSReview(PSReviewDTO dto);

	void viewCount(String psrseq);

	int psrdeleteok(String psrseq);

	List<PSReviewDTO> psreviewsearch(String word);

	int mCnt();

	int psCnt();

	int aCnt();

	int psrCnt();

	// 동균 부분 END

}
