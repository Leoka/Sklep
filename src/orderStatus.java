/**
 * Created by emajgra on 3/23/2016.
 */
public enum orderStatus {
    PENDING, COMPLETED, PREPARATION_IN_PROGRESS, IN_SHIPPING, DELIVERED;

    public orderStatus next() {
        return values()[ordinal() + 1];
    }
    }
