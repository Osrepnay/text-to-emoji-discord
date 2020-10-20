input_string=input('Input: ')
new_str=''
for x in range(0, len(input_string)):
	if input_string[x] != ' ':
		new_str+=':regional_indicator_'+input_string[x]+': '
	else:
		new_str+='  '
	
print(new_str)
