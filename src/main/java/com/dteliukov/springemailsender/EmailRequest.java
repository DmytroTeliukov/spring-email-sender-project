package com.dteliukov.springemailsender;

public record EmailRequest(String to, // The recipient email address. Example: recipient@example.com
                           String subject, // The subject of the email. Example: Test Email
                           String text // The content or body of the email. Example: Hello world!
                           ) {
}
