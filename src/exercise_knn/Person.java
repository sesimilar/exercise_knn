package exercise_knn;

public class Person implements Comparable<Person>{
	private float classReal;
	private float age;
	private float sex;
	private float survived;
	private float predict;
	private float distance;
	
	
	public float getPredict() {
		return predict;
	}
	public void setPredict(float predict) {
		this.predict = predict;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public float getClassReal() {
		return classReal;
	}
	public void setClassReal(float classReal) {
		this.classReal = classReal;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public float getSex() {
		return sex;
	}
	public void setSex(float sex) {
		this.sex = sex;
	}
	public float getSurvived() {
		return survived;
	}
	public void setSurvived(float survived) {
		this.survived = survived;
	}
	
	@Override
	public String toString() {
		return "Person [classReal=" + classReal + ", age=" + age + ", sex=" + sex + ", survived=" + survived + "]";
	}
	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		if(this.distance<other.distance)
			return -1;
		if(this.distance ==other.distance)
			return 0;
		else {
			return 1;
		}
	}	
}
