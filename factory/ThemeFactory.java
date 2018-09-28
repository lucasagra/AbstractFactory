/*
This interface implements the
Abstract Factory Pattern
*/

package factory;

import products.button.Button;
import products.list.List;
import products.text.Text;

public interface ThemeFactory {
    Button createButton();
    Text createText();
    List createList();
}
