package online.test.idemia;

/**<pre>
 * Problem:
 * -------------------------------
 * In a particular social network site, friends are automatically allocated to users by system.
 * User can not add friends of their choice.
 * 
 * Their are currently N users on the sites labeled as 2 to N+1.
 * For every i user (where i ranges from 2 to N+1), the system allocated 
 * all the users labeled with multiple of i as user's friend.
 * For example: 
 * 		- 4,6,8,... will be friend of 2
 * 		- 6,9,12,... will be friend of 3
 *   
 * One day all user come together for a meeting and they form groups such that 
 * each person in a group is direct friend OR friend of friend of every other person in that group.
 * For example: 
 * 	 6 is direct of 2 and 6 is also direct friend of 3,
 *   so 2 and 3 are friend (of friend) hence will be in same group.
 *     
 *   
 * Find the total no of groups?
 * -------------------------------
 * Input:    
 *  N    - denoting the number of users on the site.
 *  
 * Output:
 *  No of groups as given in problem
 *  
 *  
 *  -------------------------------  
 * Sample Input and Output:
 * Example 1:
 *  	Input: 5
 *  	Output: 2
 *  
 *      Explanation:
 *      	Users are 2,3,4,5,6   
 *      	So 2 groups will be formed as below
 *          (2,3,4,6) and (5)
 *        
 * Example 1:
 *  	Input: 10
 *  	Output: 3
 *  
 *      Explanation:
 *      	Users are 2,3,4,5,6,7,8,9,10,11   
 *      	So 3 groups will be formed as below
 *          (2,3,4,5,6,8,9,10) and (7) and (11)          
 * 
 * 
 * </pre>
 * @author harindra.chaudhary
 *
 */
public class SocialNetworkProblem 
{
	public static int getFiriendsGroup(int n)
	{
		if( n <= 2)
		{
			return n;
		}
		
		int group = 1;
		
		// determine half of the total count
		int i = (n+1)/2 + 1;		
		
		for(; i <= (n+1); i++ )
		{
			if( isPrime(i) )
			{
				group +=1; 
			}			
		}		
		return group;
	}

	public static boolean isPrime(int number) 
	{
        for (int i = 2; i <= number/2; i++) 
        {
            int remainder = number % i;
            
            //if remainder is 0 than number is not prime
            if (remainder == 0) 
            {
                return false;
            }
        }
        return true; 
    }

	public static void main(String[] args) 
	{
		 System.out.println( getFiriendsGroup(12) );
		 System.out.println( getFiriendsGroup(10) );
		 System.out.println( getFiriendsGroup(5) );
		 System.out.println( getFiriendsGroup(4) );
		 System.out.println( getFiriendsGroup(3) );
		 System.out.println( getFiriendsGroup(2) );
		 System.out.println( getFiriendsGroup(1) );
	}
	
}
