package how2j.ExceptionDemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

public class AccountService {
    Logger logger = Logger.getLogger(AccountService.class);

    @Test
    public void overdraf() {
        BasicConfigurator.configure();
        Account account = new Account(100.00);
        account.deposit(50);
        try {
            account.withdraw(100);
            account.withdraw(100);
        } catch (OverdraftException e) {
            logger.debug(e);
        }
    }
}



