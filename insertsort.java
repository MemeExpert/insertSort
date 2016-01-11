insertSort([1,2,3,4,5], 0);
insertSort([1,2,3,4,5],10);

//inserts a value in an array]
public int[] insertSort(int list[], int value) {
	for (int i=list.length-1 ; value>list[i] ; i--)
		list[i+1]=list[i];
	list[i+1]=value;
}
		
