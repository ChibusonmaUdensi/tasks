
count = 0
number =int(input('enter a number'))
multiple_list =[]
for multiple in range(10):
	count +=1
	multiple = number * count
	multiple_list.append(multiple)
print (multiple_list)