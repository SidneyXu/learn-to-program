import urllib.request

resp = urllib.request.urlopen('https://www.github.com')
html = resp.read()
print(html.decode('utf-8'))
