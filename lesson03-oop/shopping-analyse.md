+Class
Customer: id, name, phone, address
Item : id, os, color, cost

B1:Create list of customers
B2:Create array of items in store
B3:Shopping function
+Who is buying
+List of items 
+Amount of each item
+DateTime 
=> Order : customer,item_details[], date_time
=>IteamDetail: item, quantity
===================================
+Object
c1:Kh1, Adam, 123, NewYork
c2:Kh2, Kate, 243 ,California

i1: ss10+, Android, Black, 620
i2: SS20U, Android, Green, 840
i3: IP4, IOS , White ,280
i4: IP12, IOS, Black, 280
i5:WP8, WndowPhone, Blue, 560

o1: c1, {id1(i1,3), id2(i4, 1), id3(i2,1)}, date_time
o2: c2,{id1{i3,2), id2(i5, 1)}, 20:10:12 07.05.2021
o3: c2,{id1{i4, 1)}, 09:28:32 08.05.2021

C.Function
+export(order) => TotalOfAmount: Void