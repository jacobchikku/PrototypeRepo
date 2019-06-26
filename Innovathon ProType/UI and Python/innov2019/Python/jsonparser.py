import csv
import json

# Open the CSV
f = open('order.csv', 'r')

# Change each fieldname to the appropriate field name.
reader = csv.DictReader(f, fieldnames=("ownerGroup","objectType","quantity"))

# Parse the CSV into JSON
out = json.dumps([row for row in reader])
print("JSON parsed!")
# Save the JSON
f = open('order.json', 'w')
f.write(out)
print('Save')
