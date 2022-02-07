import java.util.*;
public class TowerOfHanoi {
	static Stack<Integer> peg1, peg2, peg3;
	static int move, past[];
	public static void main(String[] args) {
		
		System.out.println("Original Tower of Hanoi");
		for(int i=1; i<10; i++) {
			move = 0;
			TowerOfHanoi(i, 0, 1, 2);
			System.out.println("Number of disks: " + i + "\tmoves: " + move);
		}
		
		System.out.println("\nAdjacency Tower of Hanoi");
		for(int i=1; i<10; i++) {
			move = 0;
			TowerOfHanoiV1(i, 0, 1, 2);
			System.out.println("Number of disks: " + i + "\tmoves: " + move);
		}
		
		System.out.println("\nExchange and Adjacency Tower of Hanoi");
		for(int i=1; i<10; i++) {
			move = 0;
			TowerOfHanoiV2(i, i, 0, 1, 2, i==2);
			System.out.println("Number of disks: " + i + "\tmoves: " + move);
		}

	}
	
	static void TowerOfHanoi (int disks, int start, int temp, int end) { // end is where the disk wants to end up
		if(disks == 1) {
			move++; return;
		}
		
		TowerOfHanoi(disks-1, start, end, temp);
		move++;
		TowerOfHanoi(disks-1, temp, start, end);
	}
	
	static void TowerOfHanoiV1 (int disks, int start, int temp, int end) {
		if(disks == 1) {
			move += 2; return; // moving disk "disks" from start to temp to end
		}
		
		TowerOfHanoiV1(disks-1, start, temp, end); 
		move++;
		TowerOfHanoiV1(disks-1, end, temp, start); 
		move++;
		TowerOfHanoiV1(disks-1, start, temp, end); 
	}
	
	static void TowerOfHanoiV2 (int num, int disks, int start,  int temp, int end, boolean finalRecursive) {
		if(disks == 1) {
			move += 2; return;  // moving disk "disks" from start to temp to end
		} else if(disks == 2) {
			if(finalRecursive) {
				move++; // disk 1 moves
				exchange(2);
				TowerOfHanoiV2(num, disks-1, start, temp, end, true);
				exchange(2);
				move++; // disk 1 moves
			} else {
				move++;
				exchange(2);
				TowerOfHanoiV2(num, disks-1, start, temp, end, true);
				exchange(2);
				exchange(num);
			}
		} else{
			TowerOfHanoiV2(disks, disks-1, start, temp, end, false); 
			TowerOfHanoiV2(disks, disks-1, end, temp, start, false); 
			TowerOfHanoiV2(disks, disks-1, start, temp, end, true); 
		}
		
	}
	
	static void exchange(int swapWith) { // disk 1 exchange places with disk swapWith
		move++;
	}
}
