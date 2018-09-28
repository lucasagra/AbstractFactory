/*
This interface implements the
Abstract Factory Pattern
*/

package code.factory;

import code.products.button.Button;
import code.products.list.List;
import code.products.text.Text;

public interface ThemeFactory {
    Button createButton();
    Text createText();
    List createList();
}
