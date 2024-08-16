package main;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class BankClientModule {
    @Provides
    @Singleton
    public BankClient provideBankClient () {
        return new BankClient();
    }
}
