package arrayprograms;

public class Arrayprintnumberofonesin2darray {
	
	
	//finding number of 1 in 2d array
	public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3}, 
            {1, 2, 3, 4}, 
            {1}, 
        };
      int count=0;
       /* System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);*/
        
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                //System.out.println(a[i][j]);
                if(a[i][j]==3)
                {
                	count++;
                	System.out.println(a[i][j]);
                }
            }
        }
        
        System.out.println(count);
    }
	
	
	
	
	
	

}
