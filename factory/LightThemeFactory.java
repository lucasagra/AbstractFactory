package factory;

import products.button.*;
import products.list.*;
import products.text.*;

public class LightThemeFactory implements ThemeFactory {

    public Button createButton(){
        return new DarkButton();
    }

    public Text createText(){
        return new DarkText();
    }

    public List createList(){
        return new LightList();
    }
}
