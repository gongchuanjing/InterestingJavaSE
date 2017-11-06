package tk.chuanjing.stage1.exam_14term;
/**
 * @author ChuanJing
 * @date 2017年8月11日 下午2:41:46
 * @version 1.0
 */
public class Test05_Student {

	private String id;
	private String name;
	private double score;
	
	public Test05_Student(){
		
	}
	
	public Test05_Student(String id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public double getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score
				+ "]";
	}
}
