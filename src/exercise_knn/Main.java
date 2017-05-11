package exercise_knn;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
			List<Person> exerciseDt = new ArrayList<Person>();
			List<Person> forecastOriginDt = new ArrayList<Person>();
			ReadFile readFile = new ReadFile();
			KnnAgorithem kAgorithem= new KnnAgorithem();
			readFile.readFile(exerciseDt, forecastOriginDt);
			for(int i = 1 ; i<=20;i++){
				kAgorithem.setKey(i);
				kAgorithem.getForecastResult(exerciseDt, forecastOriginDt);			
				caculatResult(forecastOriginDt,i);
			}
			
	}
	
	private static void caculatResult(List<Person> forecastOriginDt,int j){
		int size = forecastOriginDt.size();
		int count = 0;
		for(int i = 0 ; i<size;i++){
			Person person = forecastOriginDt.get(i);
			if(equal(person.getPredict(), person.getSurvived())){
				count++;
			}
		}
		System.out.println("key value : "+ j + "  forecast result is :" + (count/(float)size));
		
	}
	private static boolean equal(float a, float b){
		if((a-b>-0.000001)&&(a-b)<0.000001)
			return true;
		else {
			return false;
		}
	}
	
	private static void test(List<Integer> test){
		test.add(1);
		test.add(2);
	}
}
