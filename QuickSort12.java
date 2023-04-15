package javaPrograms;


class quick{
	
	
//   method start for quicksort
	void quicksort(int input[],int lb, int ub)
	{
		if(lb<ub)
		{
		int loc = partition(input, lb, ub);
			quicksort(input,lb,loc-1);
			quicksort(input,loc+1,ub);
		}
	}

//  method end for quick sort
	
	
//    starting partition method
	int partition(int input[],int lb, int ub)
	{
		
		int pivot = input[lb];  // first element as pivot
		int start=lb;
		int end = ub;
		while(start<end)
		{
			while(start<=ub &&  input[start]<=pivot  )    //here we give start<= ub so that it not give array bound error
			{
				start++;
			}
			
			while(input[end]>pivot)
			{
				end--;
				
			}
			
			if(start<end)
			{
				int temp=input[end];
				input[end]=input[start];
				input[start]=temp;
			}
		
	}
			int temp=input[lb];
			input[lb]=input[end];
			input[end]=temp;
			
			return end;
	}// end of partition end
	
	
	
}//class end





public class QuickSort12 {

	
	public static void main(String[] args) {
		
		quick ob = new quick();
		int input[] = {2,1};
		ob.quicksort(input,0,input.length-1);
		
		
		
		//print array
		System.out.print("Array elements are:-  ");
		for(int i : input) {
			System.out.print(i+"  ");
		}

	}

}


