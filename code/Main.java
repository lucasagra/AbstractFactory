package code;/*
Abstract Factory Pattern code example
@author Lucas Agra de Omena
@Instituto de Computação - UFAL
*/

import code.factory.DarkThemeFactory;
import code.factory.LightThemeFactory;
import code.factory.ThemeFactory;
import code.products.button.*;
import code.products.list.*;
import code.products.text.*;

public class Main {

    public static void main(String[] args) {

        ThemeFactory theme = new LightThemeFactory();

        Client client = new Client(theme);

        clear(client);
        smells(client);
    }

    public static void clear(Client client){

        Button button = client.buildButton();
        List list = client.buildList();
        Text text = client.buildText();

        button.doSomething();
        button.getColor();
        list.getColor();
        text.getColor();
    }

    public static void smells(Client client){

        Button button;
        Text text;
        List list;

        if (client.getTheme() instanceof DarkThemeFactory){
            button = new DarkButton();
            text = new DarkText();
            list = new DarkList();
        } else {
            button = new LightButton();
            text = new LightText();
            list = new LightList();
        }

        button.doSomething();
        button.getColor();
        list.getColor();
        text.getColor();
    }
}
