package bit.ayaulym;

public class Database {
    public static BankAccount[] allAccounts = new BankAccount[10];

    static {
        allAccounts[0] = new CityBankAccount("Ilyas", "Zhuanyshev", 34000, "KZ010322311", "0101");
        allAccounts[1] = new CityBankAccount("Erbol", "Assanbek", 13000, "KZ010322312", "0102");
        allAccounts[2] = new CityBankAccount("Nurgul", "Bazarova", 51000, "KZ010322313", "0103");
        allAccounts[3] = new CityBankAccount("Erzhan", "Asykov", 17000, "KZ010322314", "0104");
        allAccounts[4] = new CityBankAccount("Ilya", "Sobolev", 39000, "KZ010322315", "0105");
        allAccounts[5] = new NationalBankAccount("Ilyas Zhuanyshev", 87660, "KZ0101116", "0106");
        allAccounts[6] = new NationalBankAccount("Marina Yakovleva", 65879, "KZ0101117", "0107");
        allAccounts[7] = new NationalBankAccount("Saltanat Sparrows", 52000, "KZ0101118", "0108");
        allAccounts[8] = new NationalBankAccount("Mariya Veber", 91000, "KZ0101119", "0109");
        allAccounts[9] = new NationalBankAccount("Sergey Sparrows", 75000, "KZ0101110", "0100");
    }
}
