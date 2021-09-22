import java.util.LinkedHashMap;

//remove commonly occuring sentences in all three stings
public class RemoveRepeatCharIn3Strings {
	static void meth(String arr[]) {
		LinkedHashMap<String, countWithString> map = new LinkedHashMap<>();
		int j = 0;
		while (j < arr.length) {
			String s = "";
			for (int i = 0; i < arr[j].length(); i++) {
				if (arr[j].charAt(i) == ' ') {
					System.out.println(s);
					if (map.get(s) == null)
//						map.put(s, 1);
					map.put(s, new countWithString(1,j));
					else
//						map.put(s, map.get(s) + 1);
					map.put(s, new countWithString(map.get(s).count+1,j));

					s = "";
				}
				s = s + arr[j].charAt(i);

			}
			j++;
		}
		

		System.out.println(map);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I will go to walk ";
		String s2 = "I will go dance alone ";
		String s3 = "I will go today ";
		String arr[] = { s1, s2, s3 };
		meth(arr);
	}

}
class countWithString
{
	int count;
	int Stridx;
	countWithString(int count,int Stridx)
	{
		this.count=count;
		this.Stridx=Stridx;
	}
}
