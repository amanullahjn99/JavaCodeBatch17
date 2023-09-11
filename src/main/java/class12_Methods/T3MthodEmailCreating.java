package class12_Methods;
/*Create a method createEmail(). Based on values of user firstName, lastName and email type,
your method should return complete email Address.
Example: createEmail(John,Snow,gmail)->johnsnow@gmail.com
 */
public class T3MthodEmailCreating {
    String creatEmail(String firstName, String lastName, String email){

        return firstName+lastName+"@"+email+".com";

    }
}
