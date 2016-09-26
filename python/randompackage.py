import random
import sys

names = ['shahm', 'ghazni', 'nattarshah']
print (random.choice(names))     
print (random.random())
print (random.uniform(1, 20))

for i in range(len(names)):
    random.shuffle(names)
    print (names)

