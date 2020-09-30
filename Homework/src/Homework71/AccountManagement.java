package Homework71;

import java.io.IOException;
import java.util.Scanner;

public class AccountManagement implements AccountService {
    Account account = new Account();

    public AccountManagement() throws IOException {

    }

    public void management() throws IOException {
        int i;
        int j;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите команду: \n");
        try {
            switch (sc.next()) {
                case "balance":
                    AccountManagement action1 = new AccountManagement();
                    i = sc.nextInt();
                    action1.balance(i);
                    break;
                case "withdraw":
                    AccountManagement action2 = new AccountManagement();
                    i = sc.nextInt();
                    j = sc.nextInt();
                    action2.withdraw(i, j);
                    break;
                case "transfer":
                    AccountManagement action3 = new AccountManagement();
                    i = sc.nextInt();
                    j = sc.nextInt();
                    k = sc.nextInt();
                    action3.transfer(i, j, k);
                    break;
                case "deposit":
                    AccountManagement action4 = new AccountManagement();
                    i = sc.nextInt();
                    j = sc.nextInt();
                    action4.deposit(i, j);
                    break;
                default:
                    throw new UnknownAccountException();
            }
        } catch (UnknownAccountException | NotEnoughMoneyException n) {
            System.out.println("Ошибка ввода!");
        }
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        try {
            account.read();
            if (Double.parseDouble((String) account.getAmount().get(accountId - 1)) >= amount) {
                account.setAmountMinus(accountId - 1, amount);
                System.out.println("Деньги в сумме " + amount + " успешно сняты со счета!\n");
            } else {
                throw new NotEnoughMoneyException();
            }
            account.write();
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для снятия!");
        }
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException, IOException {
        account.read();
        System.out.println(account.getAmount().get(accountId - 1));
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        try {
            account.read();
            if (Double.parseDouble((String) account.getAmount().get(from - 1)) >= amount) {
                account.setAmountMinus(from - 1, amount);
                account.setAmountPlus(to - 1, amount);
                System.out.println("Деньги в сумме " + amount + " переведены со счета " + from + " на счет " + to);
            } else {
                throw new NotEnoughMoneyException();
            }
            account.write();
        } catch (NotEnoughMoneyException | IOException e) {
            System.out.println("Недостаточно средств для перевода!");
        }
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        account.read();
        account.setAmountPlus(accountId - 1, amount);
        System.out.println("Деньги в сумме " + amount + " успешно внесены на счет!\n");
        account.write();
    }
}
