
name = 'shahm'
firstname = name
lastname = 'nattarshah'

print ('\b\a' , name, '\n', name, '\s', name , '\t', name)

print (firstname + ' ' + lastname)

print ( 'm' in name) # True

print ('m' not in lastname) # True


# formatting string()
print ("Hey %s are %c ? , I met you %d years ago " % ('how', 'u', 15)) # Hey how are u ? , I met you 15 years ago

location = 'C:\\folder'

print (location)
print (r'c:\\folder')

print('shahm'.capitalize())
nstr = ' this is the sample string'
print (nstr.center(25, 'z'))

print ('lower' ,nstr.lower())
print ('upper' ,nstr.upper())
print('ends with', nstr.endswith('string'))
print('starts with' , nstr.startswith('string'))

print(nstr.lstrip())

print('min', min(nstr))
print('max', max(nstr))