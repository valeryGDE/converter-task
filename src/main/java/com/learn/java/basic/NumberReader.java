package com.learn.java.basic;

import com.learn.java.basic.exception.DataParserException;
import com.learn.java.basic.exception.NumberParserException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberReader {

    private String path;
    private NumberParser parser;

    public NumberReader(String path) {
        this.path = path;
    }

    public NumberReader(String path, NumberParser parser) {
        this.path = path;
        this.parser = parser;
    }

    public NumberParser getParser() {
        return parser;
    }

    public void setParser(NumberParser parser) {
        this.parser = parser;
    }

    public List<Data> take() throws NumberParserException {

        FileReader reader = null;
        List<Data> result = new ArrayList<Data>();

        try {
            reader = new FileReader(path);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                Data newData = parser.parse(scanner.nextLine());
                result.add(newData);
            }

        } catch (FileNotFoundException e) {
            throw new NumberParserException(e);
        } catch (IOException e) {
            throw new NumberParserException(e);
        } catch (DataParserException e) {
            throw new NumberParserException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new NumberParserException(e);
                }
            }
        }

        return result;

    }

}
