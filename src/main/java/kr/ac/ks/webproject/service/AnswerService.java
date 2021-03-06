package kr.ac.ks.webproject.service;

import java.util.List;

import kr.ac.ks.webproject.dto.Answer;
import kr.ac.ks.webproject.dto.Question;

public interface AnswerService {
	public List<Answer> getAnswers(Long questionId);
	public Answer getOneAnswer(Long answerId);
	public Answer addAnswer(Answer answer, Long questionId, Long userId);
	public int removeAnswer(Long answerId);
}
