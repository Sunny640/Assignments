package assignments;
import java.util.*;
class thirds{
PriorityQueue<Integer> pq = new PriorityQueue<>();
	public int find(int [] A, int k){
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
		thirds s=new thirds();
		System.out.println("3rd smallest element:" + s.find(A,3));

	}

}