package math;

public class Calculation {
    public static double eval(float x, float y, float t) {
//        x -= 0.5f;
//        y -= 0.5f;
        float orig_x = x, orig_y = y;

        //Polar coordinates:
        x = (float) Math.sqrt(x * x + y * y);
        y = (float) Math.atan(orig_y / orig_x);

//        x *= 3 + t * 20;
//        y *= 3 + t * 20;

//        x *= 3 + t * 20 * x;
//        y *= 3 + t * 20 * y;

        x *= 3 + t * 20 * t;
        y *= 3 + t * 20 * t;

        return Math.exp(x * x * x) / y * x / (2 - x);
//        return (1 / Math.cos(x) + Math.sin(y));

//        return (x - 1) * x + y * y;
//        return orig_y * orig_y * 50 - x * x - y * y;
//        return (float) (Math.sin(x + t * 5) + Math.cos(y + t * 7));
//        return (float) Math.sqrt(x*x + y*y);

//        return x * x * x + y * y;
//        return (float) (Math.log(x) + y * y);
        //return x + x * y * y - x * y * x;
//        return (float) Math.sqrt(x * x + y * y);
//        return x*x*y + x*y*y;
//        return x*x - y*y*y;
    }
}
