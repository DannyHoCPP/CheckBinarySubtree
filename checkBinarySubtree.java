public class checkBinarySubtree
{
	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int userInput)
		{
			data = userInput;
			left = null;
			right = null;
		}
	}
	
	public static boolean emptyTree(Node T1, Node T2) 
	{
	    if (T2 == null)
	    {
	        return true;
	    }
	    else
	    {
	        return subTree(T1, T2);
	    }
	}

	public static boolean subTree(Node right1, Node right2)
	{
	    if (right1 == null)
	    {
	        return false; 
	    }
	    if (right1.data == right2.data) 
	    {
	        if (compareTree(right1, right2)) 
	        {
	        	return true;
	        }
	    }
	    return (subTree(right1.left, right2) || subTree(right1.right, right2)); 
	}

	public static boolean compareTree(Node right1, Node right2) 
	{
	    if (right2 == null && right1 == null)
	    {
	        return true;
	    }
	    if (right1 == null || right2 == null) 
	    {
	        return false; 
	    }
	    if (right1.data != right2.data) 
	    {
	        return false; 
	    }
	    return (compareTree(right1.left, right2.left) && compareTree(right1.right, right2.right));
	}	
	
	public static void main(String[] args)
    {

		Node T1 = new Node(1);
        T1.left = new Node(2);
        T1.right = new Node(3);
        T1.left.left = new Node(9);
        T1.left.right = new Node(10);
        T1.right.left = new Node(4);
        T1.right.right = new Node(5);
        T1.right.right.left = new Node(11);
        T1.right.right.right = new Node(12);
        
        Node T2 = new Node(3);
        T2.left = new Node(4);
        T2.right = new Node(5);
        
        if (subTree(T2, T2)) 
        {
            System.out.print("Yes");
        }
        else 
        {
            System.out.print("No");
        }
    }
	
}

