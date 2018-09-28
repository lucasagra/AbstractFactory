package code.factory;

import code.products.button.*;
import code.products.list.*;
import code.products.text.*;

public class DarkThemeFactory implements ThemeFactory {

    public Button createButton(){
        return new LightButton();
    }

    public Text createText(){
        return new LightText();
    }

    public List createList(){
        return new DarkList();
    }
}
