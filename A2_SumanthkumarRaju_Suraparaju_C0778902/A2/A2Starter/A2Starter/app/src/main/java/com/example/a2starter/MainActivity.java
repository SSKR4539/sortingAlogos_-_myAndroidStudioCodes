package com.example.a2starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String description = "Dairy-free vanilla ice cream mixed with acai, bananas, and a drizzle of strawberry syrup";
    IceCreamFlavour iceCream = new IceCreamFlavour("Brazilian Lightning", description, 8,3.15);
    TextView tvFlavourName;
    TextView quantityLeft;
    TextView desc;
    TextView price;
    EditText etNumScoops;
    TextView orderFlavour;
    TextView orderPricePerScoop;
    TextView orderQuantity;
    TextView orderTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFlavourName = findViewById(R.id.tvFlavourName);
        quantityLeft = findViewById(R.id.quantityLeft);
        desc = findViewById(R.id.desc);
        price = findViewById(R.id.price);
        etNumScoops = findViewById(R.id.etNumScoops);
        orderFlavour = findViewById(R.id.orderFlavour);
        orderPricePerScoop = findViewById(R.id.orderPricePerScoop);
        orderQuantity = findViewById(R.id.orderQuantity);
        orderTotal = findViewById(R.id.orderTotal);

//      Updating the user interface with new ice cream flavour
        tvFlavourName.setText("Today's Flavour: " +iceCream.flavour);
        quantityLeft.setText(iceCream.quantityRemaining+"");
        desc.setText(iceCream.description);
        price.setText("Price: $" + iceCream.price);

    }

    public void placeOrder(View v){
        LinearLayout output = (LinearLayout) findViewById(R.id.resultsSection);
//      if condition to check user input and validate them.
        if(!etNumScoops.getText().toString().isEmpty()){
            int quantOrdered = Integer.parseInt(etNumScoops.getText().toString());
            if( quantOrdered > 0 ){
                if(quantOrdered > iceCream.quantityRemaining){
                    output.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Sorry!! No Stock",Toast.LENGTH_SHORT).show();
                }
                else{
                    double totalCost = iceCream.getTotalCost(quantOrdered);

                    output.setVisibility(View.VISIBLE);

                    orderFlavour.setText("Flavour: "+ iceCream.flavour);
                    orderPricePerScoop.setText("Price per scoop: $"+iceCream.price);
                    orderQuantity.setText("Num Scoops: "+quantOrdered);
                    orderTotal.setText("Total: $" + totalCost);
                }
            }
            else{
                output.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"Please enter correct value",Toast.LENGTH_SHORT).show();
            }
        }
        else{
            output.setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(),"Field Required",Toast.LENGTH_SHORT).show();
        }

    }
}