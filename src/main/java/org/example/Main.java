package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        logger.info("5 + 3 = {}", calculator.add(5, 3));
        logger.info("5 - 3 = {}", calculator.subtract(5, 3));
        logger.info("5 * 3 = {}", calculator.multiply(5, 3));
        logger.info("6 / 3 = {}", calculator.divide(6, 3));
    }
}