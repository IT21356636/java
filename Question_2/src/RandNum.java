
import java.util.Random;


public class RandNum {
		private int [][] array = new int[5][5];
		private int sum;
		private int min;
		private int max;
		
		public int[][] getArray() {
			return array;
		}
		public void setArray(int[][] array) {
			this.array = array;
		}
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public int getMin() {
			return min;
		}
		public void setMin(int min) {
			this.min = min;
		}
		public int getMax() {
			return max;
		}
		public void setMax(int max) {
			this.max = max;
		}
		
		// random no array
		
		
		public void fillRandNum() {
			Random random = new Random();					// create a object 
			for(int i = 0; i< array.length; i++) {
				for(int j = 0; j< array.length; j++) {
					array[i][j] = random.nextInt(100);		//store 1 -100 random no in an array 
					
					System.out.print(array[i][j]+ " ");		//print array
				}
				System.out.println();
				
			}
		}
		
		public void minMax() {				
			
			int sum = 0;
			int max = array[0][0];
			int min = array[0][0];
			
			for(int i = 0; i< array.length; i++) {				//find min, max and sum
				for(int j = 0; j< array.length; j++) {
					if (min > this.array[i][j]) {
						min = this.array[i][j];
						setMin(min);
					}
					if (max < this.array[i][j]) {
						max = this.array[i][j];
						setMax(max);
					}
					
					sum = sum + this.array[i][j];
					setSum(sum);
					
				}
			}
			
		}
		
		public void display() {							
			minMax();
			System.out.println();
			System.out.println("Minimum No : " + getMin());				//display min , max , avg
			System.out.println("Maximum no : " + getMax());
			System.out.println("Avarage : " + getSum()/25);										
		}
		
		
		
	
		
}
