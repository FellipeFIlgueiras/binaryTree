package br.com.filgueiras;

import br.com.filgueiras.binarytree.CustomerNode;
import br.com.filgueiras.binarytree.Tree;
import br.com.filgueiras.model.Customer;

public class App {
    public static void main(String[] args) throws Exception {

        Tree<Customer> elements = new Tree<>();
        CustomerNode c1 = new CustomerNode(new Customer(5, "Fellipe"));
        CustomerNode c2 = new CustomerNode(new Customer(2, "Alves"));
        CustomerNode c3 = new CustomerNode(new Customer(3, "Filgueiras"));
        CustomerNode c4 = new CustomerNode(new Customer(7, "Souza"));
        CustomerNode c5 = new CustomerNode(new Customer(9, "Google"));

        elements.add(c1);
        elements.add(c2);
        elements.add(c3);
        elements.add(c4);
        elements.add(c5);

        elements.inOrder();
        System.out.println();
        elements.preOrder();
        System.out.println();
        elements.postOrder();
        System.out.println();
        System.out.println(elements.height());

    }

}
