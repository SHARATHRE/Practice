//Second largest element in array 

class Max {

public void findMaxSecondMax(int a[]) {
int max=0,smax=0;
for(int i=0;i<a.length;i++) {
if(max<a[i]) {
smax=max;
max=a[i]; 
}
else if(smax<a[i]) {
smax=a[i];
}
}
System.out.println("Max value: "+max);
System.out.println("second Max value: "+smax);
}

public static void main(String[] args) {

int arr[]= {17,80,34,12,90,87,54}; 
Max obj=new Max();
obj.findMaxSecondMax(arr);

}

}
