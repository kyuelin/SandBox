package dev.kyuelin.batchdemo.model;

import java.util.Date;

/**
 * Created by kennethlin on 5/21/17.
 */

//"Date","Description","Original Description","Amount","Transaction Type","Category","Account Name","Labels","Notes"

public class Transaction {
    private Date date;
    private String description;
    private String originalDescription;
    private Double amount;
    private TransactionType type;
    private Category category;
    private String accountName;
    private Label label;
    private String notes;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOriginalDescription() {
        return originalDescription;
    }

    public void setOriginalDescription(String originalDescription) {
        this.originalDescription = originalDescription;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", originalDescription='" + originalDescription + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                ", category=" + category +
                ", accountName='" + accountName + '\'' +
                ", label=" + label +
                ", notes='" + notes + '\'' +
                '}';
    }
}
