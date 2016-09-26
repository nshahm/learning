# Dictionary creation

dict = {'Name': 'Zara', 'Age': 7, 'Class': 'First'}

print ("dict['Name']: ", dict['Name'])
print ("dict['Age']: ", dict['Age'])

# Not found
dict = {'Name': 'Zara', 'Age': 7, 'Class': 'First'};
# print "dict['Alice']: ", dict['Alice']



# Updating the existing dictionary
dict['Age'] = 8; # update existing entry
dict['School'] = "DPS School" # Add new entry


print ("dict['Age']: ", dict['Age'])
print ("dict['School']: ", dict['School'])


print (dict.items())
print (dict.keys())
print (dict.values())

# Deleting the dictionary 

del dict['Class'] # remove entry with key 'Name'
dict.clear()     # remove all entries in dict
del dict         # delete entire dictionary
