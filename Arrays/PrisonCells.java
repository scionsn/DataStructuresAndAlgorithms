//There are 8 prison cells in a row, and 
//each cell is either occupied or vacant.
////
////Each day, whether the cell is occupied 
//or vacant changes according to the following rules:
////
////If a cell has two adjacent neighbors that are
//	both occupied or both vacant, then the cell becomes occupied.
////Otherwise, it becomes vacant.
////(Note that because the prison is a row, the first and
//	the last cells in the row can't have two adjacent neighbors.)
////
////We describe the current state of the prison in the
//	following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.
public class PrisonCells {
	 public static int[] prisonAfterNDays(int[] cells, int N) {
		 int dup[]=new int[cells.length];
	        dup[0]=0;
	        dup[cells.length-1]=0;
while(N-- >0) {
for(int i=1;i<dup.length-1;i++) {
	        	dup[i]=cells[i-1]^cells[i+1];
	       
	        }
for(int i=0;i<cells.length;i++) {
	cells[i]=dup[i];
}
	        
	        }
	        return cells;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cells[]= {0,1,0,1,1,0,0,1};
int n=100000000;
for(int i:prisonAfterNDays(cells,n)) {
	System.out.println(i);
}

	}

}
