require 'net/smtp'

user=''
psw=''

message = <<MESSAGE_END
From: Private Person <me@fromdomain.com>
To: A Test User <test@todomain.com>
Subject: SMTP e-mail test

This is a test e-mail message.
MESSAGE_END

html_message=<<MESSAGE_END
From: Private Person <me@fromdomain.com>
To: A Test User <test@todomain.com>
MIME-Version: 1.0
Content-type: text/html
Subject: SMTP e-mail test

This is a test e-mail message.
MESSAGE_END

Net::SMTP.start('smtp.gmail.com', 587, 'mydomain', user, psw) do |smtp|
  smtp.send_message message, 'me@fromdomain.com',
                    'test@todomain.com'
end