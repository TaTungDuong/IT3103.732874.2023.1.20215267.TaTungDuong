package LAB05.AimsProject.screen;

import LAB05.AimsProject.Cart;
import LAB05.AimsProject.Store;
import LAB05.AimsProject.media.Book;
import LAB05.AimsProject.media.CompactDisc;
import LAB05.AimsProject.media.DigitalVideoDisc;
import LAB05.AimsProject.media.Media;

import javax.swing.*;
import java.awt.*;

public class AddBookToStore extends AddMediaToStoreScreen{
    // Constructor
    public AddBookToStore(Store store, Cart cart) {
        super(store, cart, "Add Book to store", "ADD BOOK TO STORE");
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout (new GridLayout(4, 2, 2, 2));
        addInputRow(center, "Id", tfId);
        addInputRow(center, "Title", tfTitle);
        addInputRow(center, "Category", tfCategory);
        addInputRow(center, "Cost", tfCost);
        return center;
    }

    public Media createMedia() {
        return new Book(Integer.parseInt(tfId.getText()), tfTitle.getText(),
                tfCategory.getText(), Float.parseFloat(tfCost.getText()));
    }
}
