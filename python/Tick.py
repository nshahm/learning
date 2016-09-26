import time
import calendar
from datetime import date

tic = time.time();
print (tic)

print ('localtime', time.localtime());

#Format time - Readable format

print (time.asctime(time.localtime()))

# printing the calendar month 
print (calendar.month(2016, 9))

# printing the calendar month 
print (calendar.month(2016, 9, 2))


struct_time = time.strptime("30 12 2015", "%d %m %Y")
print ("tuple : ", struct_time)
print ("Format Time", time.asctime(struct_time))


# Timezone
# print (time.timezone()) # not working
# print (time.tzname()) # not working

print (date.today())