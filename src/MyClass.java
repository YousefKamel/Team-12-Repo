
public class MyClass {

	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	public static boolean CheckSorted(int [] arr)
    	{
        boolean value = true;
        int [] out =new int [arr.length];
        for (int i=0;i<arr.length;i++)
        {
            out[i]=arr[i];
        }
        for (int i=0;i<out.length;i++)
        {
            for (int j=i+1;j<out.length;j++)
            {
                if(out[i]>out[j])
                {
                    int temp = out[i];
                    out[i]=out[j];
                    out[j]=out[i];
                }
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]!=out[i])
            {
                value=false;
                break;
            }
        }
        return value;
    	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
