package com.jeyanth.medicine.utils;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class CSVUtils {
    private static final CsvMapper mapper = new CsvMapper();

    public static <T> List<T> read(Class<T> clazz, InputStream stream)  {

        List<T> listToReturn ;

        try{
            CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true);
            ObjectReader reader = mapper.readerFor(clazz).with(schema);
            listToReturn = reader.<T>readValues(stream).readAll();
        } catch (Exception exp){
            //
            listToReturn = Collections.EMPTY_LIST;
        }

        return listToReturn;
    }
}