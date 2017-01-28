package assignments;
import java.util.*;
public class thirdl{
PriorityQueue<Integer> pq = new PriorityQueue<>(6, Collections.reverseOrder());
	public int find(int[] A, int k){
		for(int i=0;i<A.length;i++){
			pq.offer(A[i]);
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}
	public static void main(String[] args) {
		int[] A = { 10, 30, 50, 67, 34, 68 };
		int k = 3;
                thirdl o=new thirdl();
		System.out.println("3rd largest element:" +o.find(A,k));

	}

}