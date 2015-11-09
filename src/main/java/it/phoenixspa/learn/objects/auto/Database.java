package it.phoenixspa.learn.objects.auto;

public class Database {

    private static Database singleton;

    private Database() {}

    public static Database create() {
        if (singleton == null) {
            singleton = new Database();
        }
        return singleton;
    }

}

class Some
{
    public static void main(String[] args) {
        Database database = Database.create();

        //        new Database(); cannot be done
    }
}
