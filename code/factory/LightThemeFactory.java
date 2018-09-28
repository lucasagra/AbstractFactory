package code.factory;

import code.products.button.*;
import code.products.list.*;
import code.products.text.*;

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
