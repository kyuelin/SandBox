package dev.kyuelin.batchdemo.reader;

import dev.kyuelin.batchdemo.model.Transaction;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by kennethlin on 5/21/17.
 */
public class TransactionReader extends FlatFileItemReader<Transaction> {
    public TransactionReader() {
        this.setResource(new ClassPathResource(""));
    }
}
