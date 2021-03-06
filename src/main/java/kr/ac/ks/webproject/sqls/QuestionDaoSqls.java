package kr.ac.ks.webproject.sqls;

public class QuestionDaoSqls {
	public final static String SELECT_PAGING = "SELECT question.id, title, service_user.name as userName, question.create_date FROM question, service_user WHERE service_user.id = user_id ORDER BY question.id DESC limit :start, :limit;";
	public final static String SELECT_QUESTION_BY_ID = "SELECT question.id, service_user.id as userId, title, content, question.create_date, service_user.name as userName, service_user.email as userEmail, service_user.service_id as userServiceId FROM question, service_user WHERE service_user.id = user_id and question.id = :questionId";
	public final static String DELETE_QUESTION_BY_ID = "DELETE FROM question WHERE id = :questionId";
	public final static String SELECT_COUNT = "SELECT count(*) FROM question";
	public final static String UPDATE_QUESTION_CONTENT_BY_QUETION_ID = "UPDATE question SET title = :title, content = :content WHERE id = :questionId;";
}
