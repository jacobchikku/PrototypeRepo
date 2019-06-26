import requests

endpoint = 'http://ptsv2.com/t/gents'
headers = {'Content-Type': 'text/plain'}
data = '{ id: 1 }'

result = requests.post(endpoint, headers=headers, data=data)
print(result)
