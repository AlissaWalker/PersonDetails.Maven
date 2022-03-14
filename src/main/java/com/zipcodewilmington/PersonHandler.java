package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter =0;
        int i =0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
        // begin loop

            // use `counter` to identify the `current Person` in the array
           // personArray[0].toString() ; <- not used
            // get `string Representation` of `currentPerson`
            result= result + personArray[i].toString() ; // way to add string
            // append `stringRepresentation` to `result` variable

            counter ++;
            i++;
        }
            // end loop

        System.out.print(result); // make sure loop is printing
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
