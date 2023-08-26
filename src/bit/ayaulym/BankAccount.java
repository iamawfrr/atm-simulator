package bit.ayaulym;

public interface BankAccount {
    String getAccountNumber(); // Данный метод возвращает номер счета

    String getPinCode(); // Данный метод возвращает пин код карточки

    void setPinCode(String pinCode); // Данный метод меняет пин код карточки

    int totalBalance(); // Данный метод возвращает текущий баланс

    void creditBalance(int credit); // Данный метод мы используем при снятии денег со счета

    void debitBalance(int debit); // Данный метод мы используем при добавлении денег к счету

    String accountData(); // Данный метод возвращает данные о клиенте
}
