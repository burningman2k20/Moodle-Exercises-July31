package com.example.moodleexercisesjuly31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {

    public int number1 = 0;
    public int number2 = 0;
    public int EvenOddNumber = 0;
    public int numberWord = 0;

    public int multiple1 = 0;
    public int multiple2 = 0;

    Button evalButton, clearButton;
    Button numberWordButton;
    Button largerButton, largerClearButton;
    Button multipleButton, multipleClearButton;

    TextView txtEvenOdd, txtResultEvenOdd, editNumberWord, textNumberWord;
    TextView numLarge1, numLarge2, txtLarger;
    TextView numMultiple1, numMultiple2, textMultiple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evalButton = (Button) findViewById(R.id.buttonOne);
        clearButton = (Button) findViewById(R.id.butClearEvenOdd);

        numberWordButton = (Button) findViewById(R.id.buttonThree);
        largerButton = (Button) findViewById(R.id.buttonFour);
        largerClearButton = (Button) findViewById(R.id.buttonFive);

        multipleButton = (Button) findViewById(R.id.butMultiple);
        multipleClearButton = (Button) findViewById(R.id.butMultipleClear);

        txtEvenOdd = (TextView) findViewById(R.id.txtNumber);
        txtResultEvenOdd = (TextView) findViewById(R.id.txtResult);
        editNumberWord = (TextView) findViewById(R.id.editNumberInWord);
        numLarge1 = (TextView) findViewById(R.id.editLargeNumber1);
        numLarge2 = (TextView) findViewById(R.id.editLargeNumber2);
        txtLarger = (TextView) findViewById(R.id.textIsLarger);
        textNumberWord = (TextView) findViewById(R.id.textNumberInWord);
        numMultiple1 = (TextView) findViewById(R.id.editMultiple1);
        numMultiple2 = (TextView) findViewById(R.id.editMultiple2);
        textMultiple = (TextView) findViewById(R.id.textMultiple);

        evalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (parseInt(txtEvenOdd.getText().toString()) != 0) {
                    EvenOddNumber = parseInt(txtEvenOdd.getText().toString());
                    txtResultEvenOdd.setText(evaluateEvenOdd());
                } else {
                    Toast.makeText(getApplicationContext(), R.string.EnterNumber, Toast.LENGTH_LONG).show();
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EvenOddNumber = 0;
                //Integer.parseInt(txtEvenOdd.getText().toString());
                txtResultEvenOdd.setText(R.string.textEvenOdd);
                txtEvenOdd.setText("0");
                // your handler code here
            }
        });

        numberWordButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (parseInt(editNumberWord.getText().toString()) != 0) {
                    numberWord = parseInt(editNumberWord.getText().toString());
                    textNumberWord.setText(ReturnNumberWord());
                } else {
                    Toast.makeText(getApplicationContext(), R.string.EnterNumber, Toast.LENGTH_LONG).show();
                }

            }
        });

        largerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (parseInt(numLarge1.getText().toString()) != 0 && parseInt(numLarge2.getText().toString()) != 0) {
                    number1 = parseInt(numLarge1.getText().toString());
                    number2 = parseInt(numLarge2.getText().toString());

                    txtLarger.setText(compareNumbers());
                } else {
                    Toast.makeText(getApplicationContext(), R.string.EnterNumber, Toast.LENGTH_LONG).show();
                }

            }
        });

        largerClearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                numLarge1.setText("0");
                numLarge2.setText("0");
                txtLarger.setText(R.string.isLarger);
            }
        });

        multipleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (parseInt(numMultiple1.getText().toString()) != 0) {
                    multiple1 = parseInt(numMultiple1.getText().toString());
                    multiple2 = parseInt(numMultiple2.getText().toString());

                    textMultiple.setText(isMultipleNumbers());
                } else {
                    Toast.makeText(getApplicationContext(), R.string.EnterNumber, Toast.LENGTH_LONG).show();
                }

            }
        });

        multipleClearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                numMultiple1.setText("0");
                numMultiple2.setText("0");
                textMultiple.setText(R.string.isMultiple);

            }
        });
    }

    String isMultipleNumbers(){

        if(number(multiple1, multiple2)){
            return String.format("%d is a multiple of %d", multiple1, multiple2);
        }
        else{
            return String.format("%d is not a multiple of %d", multiple1, multiple2);
        }

    }
    public static boolean number(int num1, int num2){
        if
        ((num1 % num2) == 0)
            return true;
        else
            return false;
    }

    String compareNumbers(){
        // create Scanner to obtain input from command window
        //Scanner input = new Scanner(System.in);

        // initialize variables
        //int num1;	// first integer for input
        //int num2;	// second integer for input

        //System.out.print("Enter first integer: ");	// prompt
        //number1 = input.nextInt();	// read first integer from user

        //System.out.print("Enter second integer: ");	// prompt
        //number2 = input.nextInt();	// read second integer from user

        if (number1 > number2)
            return String.format("%d is larger than %d\n", number1, number2);

        if (number1 < number2)
            return String.format("%d is larger than %d\n", number2, number1);

        if (number1 == number2)
            return String.format("These numbers are equal\n");
    return "No Numbers to Compare";
    }

    String ReturnNumberWord(){

        switch(numberWord) {
            case 1:
                return "One";
            case 2:
                 return "Two";
            case 3:
                 return "Three";
            case 4:
                 return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 0:
                return "Zero";
            default: return "NAN";
        }
    }

    String evaluateEvenOdd(){
        //number = 48;       // Set the value of "number" here!
        //System.out.printf("The number is %d\n", this.number);
        if ( this.EvenOddNumber % 2 == 0 ) {
            return "Even";
            //System.out.print( "even\n" );   // even number
        } else {
            return "Odd";
            //System.out.printf( "odd\n" );   // odd number
        }
        //return "Nothing";
        //System.out.printf( "bye\n" );
    }
}