package class19_OverLoading_OverWriting;

public class CreditCardTester {
        public static void main(String[] args) {

            CreditCard c=new CreditCard();
            c.calInterest(100);
            Visa v=new Visa();
            v.calInterest(100);
            AX ax=new AX();
            ax.calInterest(100);
        }
    }