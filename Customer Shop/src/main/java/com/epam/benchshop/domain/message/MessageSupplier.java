package com.epam.benchshop.domain.message;

import org.springframework.stereotype.Service;

/**
 * Created by Mateusz_Finek on 6/10/2016.
 */
@Service
public class MessageSupplier {
    int counter = 0;

    public String getMessage(){

        counter++;
        return "My message " + counter;

    }

}
