package factory;

import products.button.*;
import products.list.*;
import products.text.*;

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
