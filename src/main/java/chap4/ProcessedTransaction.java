package chap4;

/**
 * Created by Antony Genil on 2019-05-27 at 19 05 for BetterCoding
 **/
public class ProcessedTransaction {
    public ProcessedTransaction(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
}
