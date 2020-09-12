package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class i_hate_same_number {
	public static void main(String[] args) {
		solution(new int[] {1,1,3,3,0,1,1});
		System.out.println(Arrays.toString(solution(new int[] {1,1,3,3,0,1,1})));
	}
	
	public static int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
        	if(arr[i] != arr[i-1]) {
        		list.add(arr[i]);
        	}
        }
        answer = new int[list.size()];
        for(int i = 0; i< list.size(); i++) {
        	answer[i] = list.get(i);
        }

        return answer;
        

    }
	
	
	
	
}
