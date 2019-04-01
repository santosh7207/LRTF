class process 
{ 
public static void main(String[] args) 
{ 
int p[]=new int[] {1,2,3},b[]=new int[] {2,4,8}; int max=b[0],i=0,k=0,c=0,l,m,f; for(i=1;i<b.length;i++) 
{ if(b[i]>max) 
{ max=i; 
} 
} 
System.out.println("the largest burst time process is:"+i); for(c=0;c<b.length;c++) 
{ k=k+b[c]; 
} 
System.out.println("the total time taken to complete all process is:"+k); 
l=k; m=k-b[0]; f=m-b[1]; float n=k/2; 
System.out.println("as arrival time is 0 for all process so average turn around time is:"+n); 
System.out.println("the first process completion time is:"+l); 
System.out.println("the second process completion time is:"+m); 
System.out.println("the third process completion time is:"+f); 
System.out.println("the first process waiting time is:"+(l-b[0])); 
System.out.println("the second process  waiting time is:"+(m-b[1])); System.out.println("the third process waiting time is:"+(f-b[2])); int g=l-b[0],h=m-b[1],x=f-b[2]; int wt=g+h+x; 
System.out.println("the total  waiting time is:"+wt); wt=wt/2; 
System.out.println("the average waiting time is:"+wt); 
}} 
