import factory.ThemeFactory;
import products.button.Button;
import products.list.List;
import products.text.Text;

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
