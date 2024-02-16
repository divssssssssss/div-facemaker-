import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
public class Face {
    //initialize variables for the face class
    public int skinColor = 0;
    public int eyeColor = 0;
    public int hairColor = 0;
    public int hairStyle = 0;

    //helper method to generate the random numbers for the RGB values
    private int getRandomColor() {
        return Color.rgb(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        );
    }

    //helper method to generate a random hairstyle
    private int getRandomHairstyle() {
        return (int) (Math.random() * 3);
    }

    //set the variables by using the getter methods
    public void randomize() {
        // Generate random colors
        skinColor = getRandomColor();
        eyeColor = getRandomColor();
        hairColor = getRandomColor();
        // Randomly select a hairstyle
        hairStyle = getRandomHairstyle();
    }

    //draw the face
    public void onDraw(Canvas g) {

    }
}
