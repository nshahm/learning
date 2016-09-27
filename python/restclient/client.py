# Before running this insall requests lib
# pip install requests

import requests

# requests.Response = requests.get("https://shahm-paperspace.herokuapp.com/paperspace")
res = requests.get("https://shahm-paperspace.herokuapp.com/paperspace")
print (res.content)
print (res.status_code)
print (res.headers)
print (dir(res))