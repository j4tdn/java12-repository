- Class : 
	+ Customer : id, name, phone, address
	+ Item : id, os, color, cost
	
B1: Create list of customers
B2: Create array of items in store
B3: Shopping function
	+ Who buying
	+ List of items
	+ Amount of each item
	+ Time
	=> item_details: item, quantity
	=> Order : customer, item_details[], time
	
	
===============================================
- Object :
	+Customer : C1 : 1, Adam, 270, NewYork
	 			C2 : 2, Kane, 300, England
	 			C3 : 3, Neymar, 11, Brasil
	+Item :     I1: SS10+, Android, Black, 10
				I2: SS20, Android, White, 20 
				I3: IP8, SOS, Pink, 8
				I4: Ip10, SoS, Yellow, 10
	+Order :    O1 : C1, {id1{I1,3}, id2{I2,1}, id3{I3, 4}}, 10:10:10 08:05:2020
			 	O2 : C2, {id2{I1,1}, id2{I2,0}, id3{I3, 2}}, 10:10:10 06:03:2020
				O3 : C2, {id2{I1,1}}, 11:10:10 06:03:2020
		
	