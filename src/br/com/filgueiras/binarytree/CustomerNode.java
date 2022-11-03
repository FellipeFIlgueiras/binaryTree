package br.com.filgueiras.binarytree;

import br.com.filgueiras.model.Customer;

public class CustomerNode extends Node<Customer> {

    public CustomerNode(Customer value) {
        super(value);
    }

    @Override
    public int weight() {
        return this.value.getId();
    }

}
