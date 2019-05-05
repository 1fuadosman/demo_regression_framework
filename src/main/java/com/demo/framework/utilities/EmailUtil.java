package com.demo.framework.utilities;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSummary;
import com.mailosaur.models.SearchCriteria;
import org.testng.Assert;
import javax.mail.MessagingException;


import java.io.IOException;
import java.util.List;

public class EmailUtil {

    //ToDO: Need a valid Mailousaur API key
    private static MailosaurClient client = new MailosaurClient("");
    private static List<MessageSummary> emails;
    private static String server = "l76unasg";

    public static void validatePasswordReset() throws IOException, MessagingException, MailosaurException{
            SearchCriteria criteria = new SearchCriteria();
            criteria.withSentTo("testy-test.l76unasg@mailosaur.io");
            Message email = client.messages().waitFor(server, criteria);
            Assert.assertEquals( email.subject(), "Wowcher  - Reset Password");

    }


}
