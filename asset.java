import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//the text file reads like:
//ID-of-asset : Expected-return : Risk-level : Quantity(units)
class Asset {
    String id;
    double expectedReturn;
    double riskLevel;
    int quantity;

    public Asset(String id, double expectedReturn, double riskLevel, int quantity) {
        this.id = id;
        this.expectedReturn = expectedReturn;
        this.riskLevel = riskLevel;
        this.quantity = quantity;
    }
}
