
public class ChocolateAndWrapper {
static int calcChocolatesFromPrice(int chocs,int price,int wrapper)
{
//	number of chocolates that we can get according to the price
	int choc_from_price=chocs/price;
//	now we calc the extra chocoltaes we can get by giving the wrapper number of chocs to get an extra chocs
	return choc_from_price+calcChocolatesFromWrapper(chocs,wrapper);
	
}
static int calcChocolatesFromWrapper(int chocs,int wrappers)
{
//	if number of chocs are lesser than the number of wrapppers then we cant get extra chocolates
if(chocs<wrappers)
	return 0;
//number of extra chocolates that i can get from giving the wrappers 
//of those that i have as per required from the wrappers variable
int xtra_choc=chocs/wrappers;
//number of xtra chocoltaes i can get by giving wrappers according to wrapper variable
//the % oper handles if number of chocs are not directly divisible by number of wrappers req
// to get an extra chocoltae

return xtra_choc+calcChocolatesFromWrapper(xtra_choc+chocs%wrappers,wrappers);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int chocs=15;
int price=1;
int wrappers=3;
System.out.println(calcChocolatesFromPrice(chocs,price,wrappers));
	}

}
