package com.czetsuya.designpatterns.behavioral.strategy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class JobRecommendation {

    private Recommendation recommendationAlgo;

    public void setAlgorithm(Recommendation recommendationAlgo) {
        this.recommendationAlgo = recommendationAlgo;
    }

    public String computeRecommendation() {
        return recommendationAlgo.compute();
    }

}
