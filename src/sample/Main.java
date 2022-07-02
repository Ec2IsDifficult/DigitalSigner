package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.crypto.Cipher;
import java.security.Security;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

    }

    public static void main(String[] args) throws Exception {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
    }
}

