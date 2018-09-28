package code;

import code.factory.ThemeFactory;
import code.products.button.Button;
import code.products.list.List;
import code.products.text.Text;

public class Client {

    private ThemeFactory theme;

    public Client(ThemeFactory theme){
        this.theme = theme;
    }

    public Button buildButton(){
        return theme.createButton();
    }

    public List buildList(){
        return theme.createList();
    }

    public Text buildText(){
        return theme.createText();
    }

    public ThemeFactory getTheme(){
        return this.theme;
    }
}
