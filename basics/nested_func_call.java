
package ds_algo;

/**
 *
 * @author SCION
 * practicing problems
 */
public class nested_func_call {
    static int call(int n){
        if(n==0)//base condition
            return 0;
        else {
            System.out.println("print before call");
                         call(call(n-1));//first the inner function completes processing and then the command goes to outer function.
//                         the value returned by the inner function is used by the outer function as parameter.
                         
                         System.out.println("print after call");
        }
        return 0;
    }
    public static void main(String[] args) {
       call(4); 
    }
}
