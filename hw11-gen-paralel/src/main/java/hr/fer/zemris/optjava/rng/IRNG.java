package hr.fer.zemris.optjava.rng;

public interface IRNG {

    double nextDouble();

    double nextDouble(double min, double max);

    float nextFloat();

    float nextFloat(float min, float max);

    int nextInt();

    int nextInt(int min, int max);

    boolean nextBoolean();

    double nextGaussian();
}
