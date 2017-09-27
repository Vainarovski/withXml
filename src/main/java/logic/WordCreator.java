package logic;

import java.util.List;

public class WordCreator {

public List<int> symbols ;

    public List<int> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<int> symbols) {
        this.symbols = symbols;
    }

    private strCount result = new strCount();

    public int createWord(){
        int r=0;
        for (int symbol : symbols) {
            r = result.count(symbol);
        }
        return r;

    }
}
