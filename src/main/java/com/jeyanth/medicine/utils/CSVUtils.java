package com.jeyanth.medicine.utils;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class CSVUtils {
    private static final CsvMapper mapper = new CsvMapper();

    private static Logger LOGGER = LoggerFactory.getLogger(CSVUtils.class);

    /**
     * @param clazz - Class for which data has to be loaded from CSV
     * @param stream - InputFile converted as inputstream for CSV operations
     * @param <T> - Object for which data has to be loaded from CSV
     * @return List of objects read from CSV file
     */
    public static <T> List<T> read(Class<T> clazz, InputStream stream)  {

        List<T> listToReturn ;

        try{
            CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true);
            ObjectReader reader = mapper.readerFor(clazz).with(schema);
            listToReturn = reader.<T>readValues(stream).readAll();
        } catch (Exception exp){
            LOGGER.error("Error in parsing CSV input {}",exp.getMessage());
            listToReturn = Collections.EMPTY_LIST;
        }

        return listToReturn;
    }
}