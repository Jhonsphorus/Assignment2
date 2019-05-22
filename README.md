				ALGORITHM 1:
1. Create a list of ten number to be arranged in an ascending order and name it List1
   	i.e. List1 =[1,4,7,5,6,10,2,8,9,3]
2. Let k be the first position of the List1 (i.e. k = 0).
3. Find the minimum number of the portion of the List1 from the kth
   position to the last position.
4. Swap the minimum number with the value in the kth position.
5. Increase k by one.
6. Repeat step 3 to step 5 until k reaches the end of the List1.
7. Then print the List2 that is filled with the ordered ascending numbers.


				ALGORITHM 2:

1. Create a list of ten number to be arranged in an ascending order and name it List1
   	i.e. List1 =[1,4,7,5,6,10,2,8,9,3]
2. Create an empty list name it List2
	i.e List2 = []
3. Let k be the first position of the List1 (i.e. k = 0).
4. Find the minimum number of the portion of the List1 from the kth
   position to the last position.
5. Drop the minimum number obtained in step4 above in the List2 to take position k=0
6. Repeat step 4 and 5 above with the remaining number and drop the number each minimum number obtained in the
   List2 with the position of each drop decreasing by 1 (i.e. k-1) until the last number is left and drop in List 2.
7. Then print the List2 that is filled with the ordered ascending numbers.




