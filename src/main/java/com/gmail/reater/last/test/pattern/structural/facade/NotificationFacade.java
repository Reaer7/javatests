package com.gmail.reater.last.test.pattern.structural.facade;

import java.time.LocalDateTime;
import java.util.UUID;

public class NotificationFacade {

    private static final String MESSAGE_TYPE_SMS = "SMS";
    private static final String MESSAGE_TYPE_EMAIL = "EMAIL";

    public void sendSms(final UUID userId) {
        final UserService userService = new UserService();
        String username = userService.getUsernameById(userId);

        final MessageTextService messageTextService = new MessageTextService();
        String messageText = messageTextService.getShortText(username, MESSAGE_TYPE_SMS);

        final MessageTitleService messageTitleService = new MessageTitleService();
        String messageTitle = messageTitleService.getShortTitle(username, MESSAGE_TYPE_SMS);

        final SendingTimeService sendingTimeService = new SendingTimeService();
        LocalDateTime time = sendingTimeService.getTime(MESSAGE_TYPE_SMS);

        final SmsDeliveryService smsDeliveryService = new SmsDeliveryService();
        smsDeliveryService.send(userId, messageTitle, messageText, time);
    }

    public void sendEmail(final UUID userId) {
        final UserService userService = new UserService();
        String username = userService.getUsernameById(userId);

        final MessageTextService messageTextService = new MessageTextService();
        String messageText = messageTextService.getFullText(username, MESSAGE_TYPE_EMAIL);

        final MessageTitleService messageTitleService = new MessageTitleService();
        String messageTitle = messageTitleService.getFullTitle(username, MESSAGE_TYPE_EMAIL);

        final SendingTimeService sendingTimeService = new SendingTimeService();
        LocalDateTime time = sendingTimeService.getTime(MESSAGE_TYPE_EMAIL);

        final EmailDeliveryService emailDeliveryService = new EmailDeliveryService();
        emailDeliveryService.send(userId, messageTitle, messageText, time);
    }
}
