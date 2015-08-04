package stream.api;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import stream.api.entity.Customer;
import stream.api.utils.ClassicOnlineStore;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Exercise3Test extends ClassicOnlineStore {

    @Test
    public void howManyItemsWanted() {
        List<Customer> customerList = this.mall.getCustomerList();

        /**
         * Count how many items there are in {@link Customer.wantToBuy} using {@link java.util.stream.Stream#count}
         */
        long sum = 0L;

        assertThat(sum, is(32L));
    }

    @Test
    public void richestCustomer() {
        List<Customer> customerList = this.mall.getCustomerList();

        /**
         * Find the richest customer's budget by using {@link java.util.stream.Stream#max} and {@link java.util.Comparator#naturalOrder}
         * Don't use {@link java.util.stream.Stream#sorted}
         */
        Comparator<Integer> comparator = null;
        Optional<Integer> richestCustomer = null;

        assertThat(comparator.getClass().getSimpleName(), is("NaturalOrderComparator"));
        assertThat(richestCustomer.get(), is(12000));
    }

    @Test
    public void youngestCustomer() {
        List<Customer> customerList = this.mall.getCustomerList();

        /**
         * Find the youngest customer by using {@link java.util.stream.Stream#min}
         * Don't use {@link java.util.stream.Stream#sorted}
         */
        Comparator<Customer> comparator = null;
        Optional<Customer> youngestCustomer = null;

        assertThat(youngestCustomer.get(), is(customerList.get(8)));
    }
}