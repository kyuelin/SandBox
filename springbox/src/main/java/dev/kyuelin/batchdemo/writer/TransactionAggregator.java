package dev.kyuelin.batchdemo.writer;

import dev.kyuelin.batchdemo.model.Transaction;
import org.springframework.batch.item.file.FlatFileItemWriter;

/**
 * Created by kennethlin on 5/21/17.
 */
public class TransactionAggregator extends FlatFileItemWriter<Transaction> {
}
