import json

content = """
{
    "data": [
        {
            "code": "404",
            "value": "not found"
        },
        {
            "code": "302",
            "value": "redirect"
        }
    ]
}
"""

obj = json.loads(content)
print(obj['data'][0]['code'])
