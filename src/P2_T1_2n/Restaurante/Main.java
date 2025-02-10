package P2_T1_2n.Restaurante;

public class Main {

    public static void main(String[] args) {
        Payment [] tables = new Payment[50];

        tables[ 1 ] = new Payment( );
        tables[ 2 ] = new Payment( );

        FoodItem a = new FoodItem( "f102" , 2 );
        FoodItem b = new FoodItem( "f100" , 1 );
        DrinkItem c = new DrinkItem( "d102" , 3 );

        tables[ 1 ].addFoodItem( a );
        tables[ 1 ].addFoodItem( b );
        tables[ 2 ].addDrinkItem( c );
        tables[ 2 ].addDrinkItem( new DrinkItem( "d103" , 1 ) );

        System.out.println( tables[ 1 ].getFiCount( ) );
        System.out.println( Payment.getFoodTax( ) );
        System.out.println( tables[ 2 ].getDi( 1 ).getItemCode( ) );

    }
}
