package groovy

/**
 * Created by mrseaons on 2014/12/30.
 */
class Toy implements Serializable {
    def toyName
    def unitPrice

    String toString() {
        return toyName + ":" + unitPrice;
    }
}
