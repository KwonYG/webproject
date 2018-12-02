package kr.ac.ks.webproject.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.ks.webproject.dao.AnswerReplyDao;
import kr.ac.ks.webproject.dto.AnswerReply;

@Service
public class AnswerReplyServiceImpl implements AnswerReplyService {
	@Autowired
	AnswerReplyDao answerReplyDao;

	@Override
	public List<AnswerReply> getAllAnswerReplies(Long answerId) {
		return answerReplyDao.selectAllReplies(answerId);
	}

	@Override
	@Transactional
	public AnswerReply addAnswerReply(AnswerReply answerReply,Long answerId, Long userId) {
		answerReply.setCreateDate(new Date());
		answerReply.setAnswerId(answerId);
		answerReply.setUserId(userId);
		Long id = answerReplyDao.insert(answerReply);
		answerReply.setId(id);

		return answerReply;
	}

}
